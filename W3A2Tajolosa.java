package Tajolosa;
import java.io.*;

public class W3A2Tajolosa {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("Sophia.txt")){
		    int ch;
		    
		    while ((ch = reader.read()) != -1){
		      System.out.print((char) ch);
		          }
		    }catch(IOException e){
		       System.out.println("Error Reading file.");
		         }
	}
}