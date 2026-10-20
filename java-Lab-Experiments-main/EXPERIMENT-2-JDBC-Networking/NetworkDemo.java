import java.net.InetAddress;

public class NetworkDemo {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");

            System.out.println("Java Networking Demo");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
