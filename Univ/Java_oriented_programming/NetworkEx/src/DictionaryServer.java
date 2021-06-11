import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class DictionaryServer {
    static boolean bRunning = true;
	static Map<String, String> db = new HashMap<String, String>();
	
	public static void main(String[] args)  {
		db.put("map","����");
		db.put("java", "�ڹ�");
		db.put("school", "�б�");

		try {
			ServerSocket server= new ServerSocket(9712); // ServerSocket ��ü ����.
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Server Start :" + local.getHostAddress() + "(" + local.getHostName() + ")");
			while(bRunning) {
				Socket socket = server.accept();
				System.out.println("Client Connect...");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				DataInputStream dis = new DataInputStream(is);
				DataOutputStream dos = new DataOutputStream(os);
				
				String strCmd = dis.readUTF();
				if(strCmd.equals("quit")) {
					dos.writeUTF("bye");
					socket.close();
					break;
				}
				String result = db.get(strCmd);
				System.out.println("strCmd Requested: " + strCmd);
				dos.writeUTF(result);
				
				socket.close();
			}
			server.close();
			System.out.println("Server terminated!");
		
		} catch (IOException e) {
			System.out.println("Error...");
		}

	}

}
