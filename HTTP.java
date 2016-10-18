import java.io.*; 
import java.net.*; 
public class HTTP 
{ 
public static void main(String[] args) 
{ 
try 
{ 
OutputStream to_file = new FileOutputStream("f:\\temp.txt"); 
URL url = new 
URL("http://www.wickedlysmart.com/HeadFirst/HeadFirstJava/HeadFirstJavaIndex.html"); 
String protocol = url.getProtocol(); 
String host = url.getHost(); 
int port = url.getPort(); 
if(port == -1) port = 80; 
String filename =url.getFile(); 
System.out.println(filename); 
Socket socket = new Socket(host, port); 
InputStream from_server = socket.getInputStream(); 
PrintWriter to_server = new PrintWriter(socket.getOutputStream()); 
to_server.print("Get" + filename +"\n\n"); 
to_server.flush(); 
byte[] buffer = new byte[4096]; 
int byte_read; 
while((byte_read = from_server.read(buffer)) != -1) 
{ 
to_file.write(buffer,0,byte_read); 
System.out.print((char)byte_read); 
} 
socket.close(); 
to_file.close(); 
} 
catch(Exception e) 
{ 
e.printStackTrace(); 
} 
}} 
