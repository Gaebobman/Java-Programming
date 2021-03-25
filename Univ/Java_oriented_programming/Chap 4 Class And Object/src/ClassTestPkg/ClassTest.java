package ClassTestPkg;

class IXServer{//class Area
	String hostName = "Inha Server";
	int port = 9717;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	IXServer(){}
	
	void printServer() {
		System.out.println(hostName);
	}
	
}//class Area

public class ClassTest {

	public static void main(String[] args) {
		IXServer server = new IXServer();
		server.printServer();
		System.out.format("%x",System.identityHashCode(server));
//		identityHashCode(server)
	}

}
