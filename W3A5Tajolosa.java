import java.io.*;
public class W3A5Tajolosa {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("copy.txt");
		FileWriter writer = new FileWriter("uppercase.txt")){
		   int ch;
		   
		   while((ch = reader.read()) != -1){
		    char letter = (char) ch;
		    writer.write(Character.toUpperCase(letter));
		      }
		      System.out.println("Successfully converted text to Uppercase.");
		     }catch(IOException e){
		      System.out.println("Error File Operation.");
		            }
	}
}