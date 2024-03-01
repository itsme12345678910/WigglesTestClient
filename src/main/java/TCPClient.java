import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void send() throws Exception{

        Socket socket = null;

        socket = new Socket("127.0.0.1", 5592);
        OutputStream output = socket.getOutputStream();

        String msg = "set_event 841 evt_task_walk -target 841 -pos1 {129.667999268 83.0825958252 15.0} -num3 999";
        output.write(msg.getBytes());
        output.flush();

        output.close();
        socket.close();

    }

    public static void main(String[] args){
        try {
            send();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}