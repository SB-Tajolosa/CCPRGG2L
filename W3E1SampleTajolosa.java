import java.io.*;
public class W3E1Tajolosa {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("Tajolosa.txt")){
		   writer.write("Sophia Briel H. Tajolosa");
		   System.out.println("Text successfully written.");
		       }catch(IOException e){
		         System.out.println("Error writing file.");
		         }
	}
}
