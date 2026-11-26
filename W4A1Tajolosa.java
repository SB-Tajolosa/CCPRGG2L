package Tajolosa;
import java.util.*;

public class W4A1Tajolosa {
	static void Tajolosa_add(int a, int b) {
		int Tajolosa_result = a + b;
		System.out.println(Tajolosa_result);
	}
	
	static void Tajolosa_subtract(int a, int b) {
		int Tajolosa_result = a - b;
		System.out.println(Tajolosa_result);
	}
	
	static void Tajolosa_multiply(int a, int b) {
		int Tajolosa_result = a * b;
		System.out.println(Tajolosa_result);
	}
	
	static void Tajolosa_divide(int a, int b) {
		int Tajolosa_result = a / b;
		System.out.println(Tajolosa_result);
	}
	
	static void Tajolosa_Menu() {
		System.out.println("Welcome! Choose from the following:\na.) Add Numbers\nb.) Subtract Numbers\nc.) Multiply Numbers\nd.) Divide Numbers");
		System.out.print("Enter choice: ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Tajolosa_num1, Tajolosa_num2;
		Tajolosa_Menu();
		String Tajolosa_choice = sc.nextLine();
		String Tajolosa_UPchoice = Tajolosa_choice.toUpperCase();
		System.out.println("\n---CALCULATION---");
		System.out.print("Enter 1st number: ");
		Tajolosa_num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		Tajolosa_num2 = sc.nextInt();
		
		switch(Tajolosa_UPchoice) {
			case "A":
				System.out.println("--RESULT--");
				Tajolosa_add(Tajolosa_num1, Tajolosa_num2);
			break;
			
			case "B":
				System.out.println("--RESULT--");
				Tajolosa_subtract(Tajolosa_num1, Tajolosa_num2);
			break;
			
			case "C":
				System.out.println("--RESULT--");
				Tajolosa_multiply(Tajolosa_num1, Tajolosa_num2);
			break;
			
			case "D":
				System.out.println("--RESULT--");
				Tajolosa_divide(Tajolosa_num1, Tajolosa_num2);
			break;

			default:
				System.out.println("\nOPERATION CEASED - Your choice is not a part of the list.");
		}
		sc.close();
	}

}
