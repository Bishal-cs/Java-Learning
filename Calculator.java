/* Write a java program to make simple calculator using userinput. */

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		
		System.out.println("The Add = "+(value1 + value2));
		System.out.println("The Sub = "+(value1 - value2));
		System.out.println("The Mul = "+(value1 * value2));
		System.out.println("The Div = "+((float)value1 / value2));

	}

}
