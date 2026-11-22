import java.io.*;
public class W3A3Tajolosa {
	public static void main(String[] args) {
		try(
		FileReader reader = new FileReader("source.txt");
		FileWriter writer = new FileWriter("copy.txt")
		){
		    int ch;
		    
		    while((ch = reader.read()) != -1){
		        writer.write(ch);
		        }
		     System.out.println("File copied successfully!");
		    }catch(IOException e){
		        System.out.println("File operation failed.");
		        }
	}
}