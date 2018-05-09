package cn.edu.hqu.cst.android.SimpleServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket ss=new ServerSocket(30000);
		while(true) {
			Socket s=ss.accept();
			OutputStream os=(OutputStream) s.getOutputStream();
			os.write("你好，我是来自服务器的消息".getBytes("utf-8"));
			os.close();
			s.close();
		}
	}

}
