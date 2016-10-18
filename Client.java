import java.io.*; 
import java.net.*; 
class Client 

{ 
public static DatagramSocket clientsocket; 
public static BufferedReader dis; 
public static InetAddress ia; 
public static byte buf[]=new byte[1024]; 
public static int cport=8081,sport=8080; 
public static void main(String a[])throws IOException 
{ 
clientsocket = new DatagramSocket(cport);

dis=new BufferedReader(new InputStreamReader(System.in)); 
ia=InetAddress.getLocalHost(); 
System.out.println("Client is sending data to Server "); 
while(true) 
{ 
String str=dis.readLine(); 
buf=str.getBytes(); 
clientsocket.send(new DatagramPacket(buf,str.length(),ia,sport)); 
} 
} 
} 
