import java.util.*;
import java.io.*;

public class W3A1Tajolosa {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("Sophia.txt")){
		  writer.write("Welcome to java Filehandling!");
		  System.out.println("Text successfully written!");
		      } catch(IOException e){
		       System.out.println("Error writing to file.");
		             }
	}
}