import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            HelloService service =
                    (HelloService) registry.lookup("HelloService");

            String message = service.sayHello("Student");

            System.out.println(message);

        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}