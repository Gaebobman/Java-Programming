import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args)  {
		try {
			Socket socket = new Socket("localhost", 5000);
			System.out.println("Client Connected...");
			DataInputStream  dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			dos.writeUTF("hello");
			
			socket.close();
		} catch (Exception e) { }

	}

}
