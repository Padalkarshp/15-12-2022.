package test;
import java.util.Scanner;
public class Pin {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int pin = 1234;
		        int tries = 0;
		        System.out.println("ENTER YOUR PIN: ");
		        int entry = scanner.nextInt();
		        tries++;
		        while (entry != pin && tries < 3) {
		            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
		            System.out.println("ENTER YOUR PIN: ");
		            entry = scanner.nextInt();
		            tries++;
		        }
		        if (entry == pin)
		            System.out.println("\nCorrect, welcome back.");
		        else if (tries >= 3)
		            System.out.println("\n“Sorry but you have been locked out.”");
		    }
		


	}


