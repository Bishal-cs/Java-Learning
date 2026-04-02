import java.util.*;
public class array_sum_digits {
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++){
            System.out.println("Enter the element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        show(arr);
    }
    // Function to calculate the sum of digits of a number
    static int sum_of_digits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }        
    // Function to display the sum of digits of each element in the array
    static void show(int []arr){
        for(int x : arr){
            System.out.println("The sum of digits of "+x+" is: "+sum_of_digits(x));
        }
    }
}

