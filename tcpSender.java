import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class tcpSender
{
  
    public static void main( String[] args )
    {
      String server = "127.0.0.1";
      int port = 20001;
      int cntr=0;
        System.out.println( "Sending messages to " + server + ":" + port );

        try
        {
            // Connect to the server
            Socket socket = new Socket( server, port );

            // Create input and output streams to read from and write to the server
            PrintStream out = new PrintStream( socket.getOutputStream() );
            BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );

            // line 1 - start of message
            String outLine = "DLTBQ05F1F.....r015238008202753ITSP05.25TAB Limited (Oncourse) VIC-OCTS-1 ITSP 5.18/5.25 ELF Wed 13 Nov 201312267";
            cntr++;
            System.out.println(cntr + ":" + outLine);
            out.println(outLine);

            // line 2 - 3 Read two response lines
            String line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);
            
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);

            // line 4 
            // RCTBQ08C1F..... 015239000002630
            outLine = "RCTBQ08C1F..... 015239000002630";
            cntr++;
            System.out.println(cntr + ":" + outLine);
            out.println(outLine);
            
            // line 5 - read response line
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);

            // line 6 - write 
            outLine = "ACTBQ08C1F..... 015239000002607";
            out.println(outLine);
            cntr++;
            System.out.println(cntr + ":" + outLine);
            
            // line 7 - read response line
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);

            // line 8 - write 
            outLine = "DCTBQ14C1F..... 015239035702626RS01102014212000000000050601020304050612WINaPAANNNNNPa1Pda1QTeDSHWaPAANNNNNPa1Pda1QTReDQU aPAANNNNNPPPPPa1Pda1QWeDEX aPAANNNNNPPPPPa1Pda1PXReDTRIaPANNNNNNPPPPPa1Pda1bDDD1aPAANNNNNPPPPPa1Pda1bDDD aPAANNNNNPPPPPa1Pda1bDSPRaSAANNNNNPPPPPa1Pda1RReDP04aCAANNNNNPPPPPa1Pda1bDOMNaPAANNNNNPPPPPa1Pda1QTeDP06aCAANNNNNPPPPPa1Pda1ReDEQDaCAANNNNNPPPPPa1Pda1QTReD3563331";
            out.println(outLine);
            cntr++;
            System.out.println(cntr + ":" + outLine);

            // line 9 - read response line
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);

            // line 10 - write 
            outLine = "TBA20C1F01... 015641027202621C022000C161111111111111111..10WINCe@@SHWCe@@QU Ce@@EX Ce@@TRICe@@SPRCe@@DD C02e@@OMNCe@@EQDC020304e@@P06C0203040506e@@10WIN011-16/SHW011-16/QU 011-16/EX 011-16/TRI011-16/SPR011-16/DD 011-16/1-24/OMN011-16/EQD011-16/1-24/1-15/1-18/P06011-16/1-24/1-15/1-18/1-8/1-8/....36137";
            out.println(outLine);
            cntr++;
            System.out.println(cntr + ":" + outLine);
            
            // line 11 - read response line
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);

            // line 12 - write 
            outLine = "TBA26C1F01... 015641000002632";
            out.println(outLine);
            cntr++;
            System.out.println(cntr + ":" + outLine);

            // line 13 - read response line
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);

            // line 14 - write 
            outLine = "TBA26C1F01... 015641000002611";
            out.println(outLine);
            cntr++;
            System.out.println(cntr + ":" + outLine);
            
            // line 15 - read response line
            line = in.readLine();
            cntr++;
            System.out.println(cntr + ":" + line);
            // line 16 - write 
            outLine = "ALTBQ92C1F.....e015240001402725ITSP05.2501072";
            out.println(outLine);
            cntr++;
            System.out.println(cntr + ":" + outLine);
            
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