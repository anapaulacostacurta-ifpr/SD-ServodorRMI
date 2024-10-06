import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class HelloServer extends UnicastRemoteObject implements HelloWorld {
 
  public HelloServer() throws RemoteException {
     super();
   }
 // main()
 // hello()
} 

public static void main(String[] args) {
 try {
 HelloServer obj = new HelloServer();
 Naming.rebind("//localhost/HelloWorld", obj);
 } catch (Exception ex) {
 System.out.println("Exception: " + ex.getMessage());
 }
}
