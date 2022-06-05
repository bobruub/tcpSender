	import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.CharBuffer;

public class tcpSender
{
  
    public static void main( String[] args )
    {
      String server = "127.0.0.1";
      int port = 2525;
      int cntr=0;
        System.out.println( "Sending messages to " + server + ":" + port );

        try
        {
            // Connect to the server
            Socket socket = new Socket( server, port );

            // Create input and output streams to read from and write to the server
// Create input and output streams to read from and write to the server
PrintStream out = new PrintStream( socket.getOutputStream() );
BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );

        InputStream inStream = null;
        inStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        



            // line 1 - start of message
            String outLine = "tcpstatus";
            out.println(outLine);
            System.out.println(cntr + ":" + outLine);
            // String line = in.readLine();
            String inputMsgLines = reader.readLine();

            System.out.println(inputMsgLines);
                      
            // Close our streams
            in.close();
            out.close();
            socket.close();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}