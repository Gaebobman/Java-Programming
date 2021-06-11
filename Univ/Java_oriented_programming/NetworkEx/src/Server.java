import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket();
		server.bind(new InetSocketAddress("localhost", 5000));
		System.out.println("Server Start!");
		Socket socket = server.accept();
		System.out.println("Connected...");
		DataInputStream  dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		//data communication
		
		String str = dis.readUTF(); //받을떄까지 block
		
		System.out.println(str);
		socket.close();
		server.close();
		System.out.println("Terminated...");
	}

}
