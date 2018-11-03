import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    int port;
    ServerSocket listener;
    public Server(int p) throws Exception {
        port = p;
        ServerSocket listener = new ServerSocket(port);
    }
    Socket socket = listener.accept();
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String inputLine;
    while ((inputLine = in) != null) {

    }

}
