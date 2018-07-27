package warmup;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		int sum=num1+num2+num3;
		
		System.out.println("What do you think is the sum?");
		
		int usersSum=input.nextInt();
		
		boolean result=usersSum == sum;
		
		System.out.println(result+"! Sum is " +sum);
		
		
	}

}
