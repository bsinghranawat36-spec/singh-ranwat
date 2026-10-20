import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

interface HelloService extends Remote {
    String sayHello(String name) throws RemoteException;
}

class HelloServiceImpl extends UnicastRemoteObject
        implements HelloService {

    HelloServiceImpl() throws RemoteException {
        super();
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "! RMI is working.";
    }
}

public class RMIServer {
    public static void main(String[] args) {
        try {
            HelloService service = new HelloServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("HelloService", service);
            System.out.println("RMI Server is running on port 1099.");
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}