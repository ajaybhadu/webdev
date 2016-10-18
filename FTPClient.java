import java.io.*; 
import java.net.*; 
public class FTPClient 
{ 
public static void main(String[] args) 
{ 
try 
{ 
Socket client = new Socket("127.0.0.1",8080); 
PrintWriter writer = new PrintWriter(client.getOutputStream()); 
writer.println("HTTP.java"); 
writer.flush(); 
InputStreamReader stream = new InputStreamReader(client.getInputStream()); 
BufferedReader reader = new BufferedReader(stream); 
String str = null; 
while((str = reader.readLine()) != null) 
{ 
System.out.println(str); 
} 
reader.close(); 
} 
catch(Exception e) 
{ 
System.out.println("Connection is terminated by the Server"); 
} } } 
