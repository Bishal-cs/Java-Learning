
# ☕ Core Java Syntax & Fundamentals

This section covers the essential building blocks of Java programming, including variables, input/output, operators, control flow, and arrays.

---

## 1. Java Data Types
Data types define the size and type of values that can be stored in a variable. 

| Data Type | Default Value | Size | Range / Details |
| :--- | :--- | :--- | :--- |
| **boolean** | `false` | 1 bit | `true` or `false` |
| **byte** | `0` | 1 byte (8 bit) | -128 to 127 |
| **short** | `0` | 2 bytes (16 bit) | -32,768 to 32,767 |
| **int** | `0` | 4 bytes (32 bit) | -2³¹ to 2³¹ - 1 |
| **long** | `0L` | 8 bytes (64 bit) | -2⁶³ to 2⁶³ - 1 |
| **float** | `0.0f` | 4 bytes (32 bit) | up to 7 decimal digits |
| **double** | `0.0d` | 8 bytes (64 bit) | up to 16 decimal digits |
| **char** | `'\u0000'` | 2 bytes (16 bit)| `'\u0000'` to `'\uffff'` |

### 🧠 Why is `char` 2 Bytes in Java?
Unlike C/C++ (where char is 1 byte), Java uses the **Unicode system** to support a wide range of international characters. The 2-byte size allows Java to support **65,536 unique characters**, covering alphabets, symbols, and special characters from many languages (English, Hindi, Chinese, Japanese, etc.).

---

## 2. Basic Program Structure & Output

### The `main` Method
Every Java program must have a main class and a `main` method to run. The class name and the filename must match.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
````

### Printing to the Console

  * `System.out.print()`: Prints on the same line.
  * `System.out.println()`: Prints and moves the cursor to the next line.

**String Concatenation Rules:**

```java
int x = 10, y = 20;

System.out.println("The numbers are " + x + " and " + y); // Output: The numbers are 10 and 20
System.out.println("" + x + y);                         // Output: 1020 (treats as strings)
System.out.println(x + y + "");                         // Output: 30 (adds first, then converts to string)
System.out.println((x + y));                            // Output: 30
```

-----

## 3\. Taking User Input (`Scanner` Class)

To take input from the user, we use the `Scanner` class from the `java.util` package.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();
        
        System.out.println("String: " + s + ", Int: " + num + ", Float: " + f);
    }
}
```

### 💻 Practice Question: Basic Calculator

*Create a class named Calculator. Take two int values as user input and perform addition, subtraction, multiplication, and division.*

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
}
```

-----

## 4\. Java Operators

Operators are symbols used to perform operations on variables and values. Java mainly has 8 types:

1.  **Unary:** `+`, `-`, `++`, `--`, `!`
2.  **Arithmetic:** `+`, `-`, `*`, `/`, `%`
3.  **Relational:** `==`, `!=`, `<`, `>`, `<=`, `>=`
4.  **Bitwise:** `&`, `|`, `^`, `~`
5.  **Shift:** `<<`, `>>`, `>>>`
6.  **Logical:** `&&`, `||`, `!`
7.  **Assignment:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`
8.  **Ternary:** `condition ? true_value : false_value;`

-----

## 5\. Conditional Statements

Used to make decisions in code based on boolean conditions.

  * **`if` statement:** Executes a block of code if a condition is true.
  * **`if-else` statement:** Executes one block if true, another if false.
  * **`if-else-ladder`:** Checks multiple conditions sequentially.
  * **`switch` statement:** Selects one of many code blocks to be executed based on a variable's value.

<!-- end list -->

```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default code block
}
```

-----

## 6\. Loops in Java

Loops are used to execute a block of code multiple times.

1.  **`for` loop:** `for(initialization; condition; increment/decrement) { ... }`
2.  **`while` loop:** `while(condition) { ... }`
3.  **`do-while` loop:** Executes the code at least once before checking the condition.
4.  **`for-each` loop:** Specifically used to iterate over arrays or collections.
      * `for(dataType variableName : arrayName) { ... }`

-----

## 7\. Arrays in Java

An array is a collection of elements of the **same datatype** stored in contiguous memory locations.

### Array Syntax & Initialization

```java
// Method 1: Declaration and Memory Allocation
int[] arr1 = new int[5];

// Method 2: With predefined values
int[] arr2 = {10, 20, 30, 40, 50};

// Method 3: Dynamic size allocation
int n = 7;
int[] arr3 = new int[n]; 
```

### 💻 Taking Array Input and Printing It

Here is how you populate an array using `Scanner` and print its contents using a loop:

```java
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n]; // Create array of size n
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Take input for each index
        }
        
        System.out.println("The array elements are:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Print each element
        }
    }
}
```