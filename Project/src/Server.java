import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Socket client;
    public PrintWriter out;
    public BufferedReader in;
    int port;
    ServerSocket listener;
    public Server(int p) throws Exception {
        port = p;
        ServerSocket listener = new ServerSocket(port);
        init();
    }
    public void init() throws Exception {
        client = listener.accept();
        out = new PrintWriter(client.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        while (in.readLine() != null) {
            out.println(in.readLine());
        }
    }

}
