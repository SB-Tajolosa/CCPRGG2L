package Tajolosa;
import java.io.*;
import java.util.*;
public class W3E1Tajolosa {

	public static void main(String[] args) {
			//Initialize the scanner and variables for the student records (Student first name, last name, number, course).
			Scanner scanner = new Scanner(System.in);
			int Tajolosa_choice, Tajolosa_StudNum;
			String Tajolosa_Lastname, Tajolosa_Firstname, Tajolosa_course;
			//Initialize the repeating variable as true for the do-while loop for the menu.
			boolean Tajolosa_repeat = true;
			
			do {
				//Display the menu for the student records.
				System.out.println("\n---STUDENT RECORDS MENU---");
				System.out.println("1.) Add new Student Record\n2.) View Student Records\n3.) Search Student\n4.) Exit");
				System.out.print("Enter Choice: ");
				Tajolosa_choice = scanner.nextInt(); //Let the user input their choice.
				
				//Use Switch-case block for the logic of the menu
				switch (Tajolosa_choice) {
					case 1:
						//First case shows adding of new student record. Using scanner to get the input of the user for each element.
						System.out.println("\n---ADDING NEW STUDENT RECORD---");
						//Using the FileWriter to create a new file for the student Records. 
						//Since the program repeats, users can add more students to the record, thats why we need to add "true" for the text to append
						try(FileWriter writer = new FileWriter("E1Sophia.txt", true)){
							System.out.print("Enter Student Number: ");
							Tajolosa_StudNum = scanner.nextInt();
							scanner.nextLine();
							System.out.print("\nEnter Student Lastname: ");
							Tajolosa_Lastname = scanner.nextLine();
							System.out.print("\nEnter Student Firstname: ");
							Tajolosa_Firstname = scanner.nextLine();
							System.out.print("\nEnter Student Course: ");
							Tajolosa_course = scanner.nextLine();
							//Using the write(), It adds the users' inputs to the file.					
							writer.write(Tajolosa_StudNum + ", " + Tajolosa_Firstname + ", " + Tajolosa_Lastname + ", " + Tajolosa_course);
							writer.write(System.lineSeparator());
						}catch(IOException e) {
							System.out.println("Error Adding new Student Record.");
						}
						//Using the try-catch to catch errors when the file operation doesn't work.
						break;
					
					case 2:
						//Using FileReader for the 2nd case, users can view the student records.
						//The reader would read the text by character from the E1Sophia.txt file and print back on the console.
						System.out.println("\n---STUDENT RECORDS---");
						try(FileReader reader = new FileReader("E1Sophia.txt")){
							int Tajolosa_ch;
							//The while loop allows it to read each character and ending once it comes back as -1.
							while((Tajolosa_ch = reader.read()) != -1) {
								System.out.print((char) Tajolosa_ch);
							}
							System.out.println();
						}catch(IOException e) {
							System.out.println("Error Reading File.");
						}
						//Using the try-catch to catch errors when the file operation doesn't work.
						break;
					
					case 3:
						scanner.nextLine();
						System.out.print("Enter Student name to search: ");
						String Tajolosa_search = scanner.nextLine();
						boolean Tajolosa_found = false;
						
						try(BufferedReader reader = new BufferedReader(new FileReader("E1Sophia.txt"))){
							String line;
							while((line = reader.readLine()) != null) {
								String[] record = line.split(",");
								
								if(record.length >= 4 && (record[1].trim().equalsIgnoreCase(Tajolosa_search) || record[2].trim().equalsIgnoreCase(Tajolosa_search))) {
									System.out.println("\n---STUDENT RECORD FOUND---");
									System.out.println("Student Number: " + record[0].trim());
									System.out.println("LastName: " + record[1].trim());
									System.out.println("FirstName: " + record[2].trim());
									System.out.println("Course: " + record[3].trim());
									
									Tajolosa_found = true;
								}
							}
							
							if(!Tajolosa_found) {
								System.out.println("\nStudent record not found.");
							}
							
						}catch(IOException e) {
							System.out.println("Error. Can't search student. ");
						}
						break;
					
					case 4:
						//Last Case lets the users exit the program.
						System.out.println("\nThank you for using the program.");
						System.out.println("Exiting Program... \nProgram Ended!");
						//Assigning the variable Tajolosa_repeat as false once they pick the 3rd option to end the program.
						Tajolosa_repeat = false;
						break;
					
					default:
						System.out.println("Choice invalid");
						//The default is when the user inputs text other than 1,2, or 3.
				}
			//While Tajolosa_repeat is true, the do-while loop will continue to run as long as the user doesn't pick the 3rd option in the menu.
			}while(Tajolosa_repeat);
			//To close the scanner.	
			scanner.close();
	}

}
