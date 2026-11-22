import java.io.*;
public class W3E2Tajolosa {
	public static void main(String[] args) {
		try(
		FileReader reader = new FileReader("Tajolosanotes.txt");
		FileWriter writer = new FileWriter("Tajolosabackup.txt")
		){
		    int ch;
		    
		    while((ch = reader.read()) != -1){
		      writer.write((char) ch);
		          }
		          System.out.println("Text Successfully copied!");
		    }catch(IOException e){
		        System.out.println("Error Copying text.");
		        }
	}
}