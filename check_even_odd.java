/* Write a java program to check if a number is even or odd as user input. */

import java.util.*;
public class check_even_odd {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num+" is Even Number");
        }
        else {
            System.out.println(num+" is Odd Number");
        }
    }
}
