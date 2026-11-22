import java.io.*;
public class W3A4Tajolosa {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("Sophia.txt", true)){
		 writer.write("\n--Today i learned about Java FileHandling.");
		  System.out.println("New Text added Successfully!");
		      }catch(IOException e){
		         System.out.println("Error Adding new Text to file.");
		           }
	}
}