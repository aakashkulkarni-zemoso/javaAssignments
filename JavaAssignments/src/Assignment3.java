// Question
// Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
//Use the system ping utility, do not use any deprecated methods.


// import statements
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Assignment3 {


    public static double median(double[] values) {

        Arrays.sort(values);
        double median;

        int totalElements = values.length;

        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = (int) (values[totalElements / 2] +
                                values[totalElements / 2 - 1]);

            median = ((double) sumOfMiddleElements) / 2;
        } else {

            median = values[values.length / 2];
        }
        return median;
    }


    public static void pingCheck (String entryIpAddress){
        try{
            String command ="ping  "+entryIpAddress;
            Process process = Runtime.getRuntime().exec(command);
            process.getOutputStream();

        }catch(Exception e){}
    }




    public static void sendPingRequest(String ipAddress)
            throws UnknownHostException, IOException
    {
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        if (geek.isReachable(5000))
            System.out.println("Host is reachable");
        else
            System.out.println("Sorry ! We can't reach to this host");
    }



    public static void ping(String ip) throws IOException {
        InetAddress inet = InetAddress.getByName(ip);
        double[] pingTimes = new double[30];

        for(int i = 0; i < 10; i++){
            long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();
            if (inet.isReachable(5000)) {
                finish = new GregorianCalendar().getTimeInMillis();
                pingTimes[i] = (double) (finish - start);
//                System.out.println(pingTimes[i]);
            }
             else {
                System.out.println(ip + " not working");
            }
        }

        double medianTime = median(pingTimes);

//        System.out.println(medianTime);

       System.out.println("Median Ping Time: " + median(pingTimes));

    }

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        String ip = scanner.nextLine();
        ping(ip);


        sendPingRequest(ip);
        pingCheck(ip);

//        InetAddress inet = InetAddress.getByName("142.250.183.142");
//        if(inet.isReachable(5000)){
//            System.out.println("is reachable");
//        }
//        else{
//            System.out.println("Not reachable");
//        }

//        pingCheck("142.250.183.142");


    }
}
