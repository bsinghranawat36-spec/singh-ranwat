import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class JNDIDemo {
    public static void main(String[] args) {
        Hashtable<String, String> env = new Hashtable<>();

        env.put(
            Context.INITIAL_CONTEXT_FACTORY,
            "com.sun.jndi.fscontext.RefFSContextFactory"
        );

        System.out.println("JNDI Demo");
        System.out.println("JNDI API is available in Java.");
        System.out.println("Naming and Directory Services concepts.");
    }
}