/* Write a java program to make simple calculator using userinput. */

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the calculator values with operator(Ex; 5 + 3): ");
		String items = sc.nextLine();

		String[] item = items.split(" ");

		if (item.length != 3) {
			System.out.println("Invalid input format. Please enter in the format: operand1 operator operand2");
			return;
		}

		int val1 = Integer.parseInt(item[0]);
		int val2 = Integer.parseInt(item[2]);
		char operator = item[1].charAt(0);

		switch (operator) {
			case '+':
				System.out.println("The Add = " + ((int)val1 + val2));
				break;
			case '-':
				System.out.println("The Sub = " + ((int)val1 - val2));
				break;
			case '*':
				System.out.println("The Mul = " + ((int)val1 * val2));
				break;
			case '/':
				System.out.println("The Div = " + ((float)val1 / val2));
				break;
			default:
				System.out.println("Invalid operator");
		}

	}

}
