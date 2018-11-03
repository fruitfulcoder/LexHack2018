import java.net.Socket;

public class Person {
    String name;
    Socket socket;

    public Person(String n) {
        name = n;
    }


    public void SendMessage(Person Dude, String text, Server serv, Person me) throws Exception{
        Message m = new Message(text);
        m.send(socket);


    }

    public String RecieveMessage(Person Dude, Server serv) {
        m.recieve(socket);
    }
}