import java.net.*; 
import java.io.*; 
import java.util.Date; 
class URLDemo 
{ 
public static void main(String[] arg) throws Exception 
{ 
int c; 
URL yahoo = new URL("http://www.msn.com"); 
URLConnection yahoocon = yahoo.openConnection(); 
System.out.println("Date: " + new Date(yahoocon.getDate())); 
System.out.println("Content-Type: " + yahoocon.getContentType()); 
System.out.println("Expires: " + yahoocon.getExpiration()); 
System.out.println("Last-Modified: " + new Date(yahoocon.getLastModified())); 
int len = yahoocon.getContentLength(); 
System.out.println("Content-Length: " + len); 
if(len>0) 
{ 
System.out.println("+++++++++ CONTENT ++++++++"); 
InputStream input= yahoocon.getInputStream(); 
int i = len; 
while(((c = input.read()) != -1) && (--i > 0)) 
{ 
System.out.print((char) c); 
} 
input.close(); 
} 
else 
System.out.println("No Content Available"); } } 

