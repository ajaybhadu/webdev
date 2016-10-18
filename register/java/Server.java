import java.io.*; 
import java.net.*; 
class Server 
{ 
public static DatagramSocket serversocket; 
public static DatagramPacket dp; 
public static BufferedReader dis; 
public static InetAddress ia; 
public static byte buf[]=new byte[1024]; 
public static int cport=8081,sport=8080; 
public static void main(String a[])throws IOException 
{ 
serversocket=new DatagramSocket(sport); 
dp=new DatagramPacket(buf,buf.length); 
dis=new BufferedReader(new InputStreamReader(System.in)); 
ia=InetAddress.getLocalHost(); 
System.out.println("Server is waiting for data from client"); 
while(true) 
{ 
serversocket.receive(dp); 
String s=new String(dp.getData(),0,dp.getLength()); 
System.out.println(s); 
} 
} 
} 
