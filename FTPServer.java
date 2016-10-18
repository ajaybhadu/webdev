import java.io.*; 
import java.net.*; 
public class FTPServer 
{ 
public static void main(String[] arg) 
{ 
try 
{ 
ServerSocket server = new ServerSocket(8080); 
Socket client; 
client= server.accept(); 
InputStreamReader stream = new InputStreamReader(client.getInputStream()); 
BufferedReader reader = new BufferedReader(stream); 
String filename = reader.readLine(); 
PrintWriter writer = new PrintWriter(client.getOutputStream()); 
FileInputStream fileStream = new FileInputStream(new File(filename)); 
int ch; 
while((ch = fileStream.read()) != -1) 
{ 
writer.write(ch); 
writer.flush(); 
} 
writer.close(); 
} 
catch(Exception e) 
{ 
e.printStackTrace(); 
} } } 
