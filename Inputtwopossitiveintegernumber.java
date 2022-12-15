package test;
import java.util.Scanner;
public class Inputtwopossitiveintegernumber {

	public static void main(String[] args) {
		int sum=0,sum1=0;
		int num1=0,num2=0,num3=0,num4=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1=input.nextInt();
       num3=num1;
		System.out.print("Enter Second Number first number must be smaller than second one: ");
		num2=input.nextInt();
          num4=num2;
		if(num1>num2){
		System.out.print("Your First Number is greater than second.So Please re-enter: ");
		num1=input.nextInt();
		}
		else{
		System.out.println("Odd Numbers: ");
		while(num1 <= num2) {
		if(num1%2 != 0) {
		System.out.println(num1);

		}
		if(num1%2!= 0) {
		sum+=num1;
		}
		num1++;
		}
		System.out.println("Sum Of odd Numbers: "+sum);
	
			System.out.println("even Numbers: ");
			while(num3 <= num4) {
			if(num3%2 == 0) {
			System.out.println(num3);

			}
			if(num3%2== 0) {
			sum1+=num3;
			}
			num3++;
			}
			System.out.println("Sum Of even Numbers: "+sum1);
				
		}
	}
}
	

	


