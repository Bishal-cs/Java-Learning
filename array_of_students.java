package array_objects;
import java.util.Scanner;

class Students{
	String name;
	int roll;
	Marks m;
	void display(){
		System.out.println("Name :" + name + "Roll :"+ roll);
	}
}
class Marks{
	double phy;
	double che;
	double math;
	double total() {
		return phy + che + math;
	}
}
public class array_of_students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Students: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Students s[] = new Students[n];
		
		for(int i = 0; i < n ; i++) {
			
			s[i] = new Students();
			s[i].m = new Marks();
			
			System.out.println("Enter the students name "+ (i + 1)+ " :");
			s[i].name = sc.nextLine();
			
			System.out.println("Ehter the Students Role No.:");
			s[i].roll = sc.nextInt();
			
			System.out.println("Enter marks of phy: ");
			s[i].m.phy = sc.nextDouble();
			
			System.out.println("Enter marks of che: ");
			s[i].m.che = sc.nextDouble();
			
			System.out.println("Enter marks of math: ");
			s[i].m.math = sc.nextDouble();
			
			sc.nextLine();
		}
		maxMarks(s);
		max_total_number(s);
		students_gread(s);
	}
	
	static void maxMarks(Students s[]) {
		
	    double maxPhy = s[0].m.phy;
        double maxChe = s[0].m.che;
        double maxMath = s[0].m.math;
        
        Students topPhy = s[0], topChe = s[0], topMath = s[0];
        
		for(int i = 0; i < s.length; i++) {
			
			if(s[i].m.phy > maxPhy) {
				maxPhy = s[i].m.phy;
				topPhy = s[i];
			}
			if(s[i].m.che > maxChe) {
				maxChe = s[i].m.che;
				topChe = s[i];
			}
			if(s[i].m.math > maxMath) {
				maxMath = s[i].m.math;
				topMath = s[i];
			}
		}
		System.out.println("Max Physics: " + maxPhy + " (Student: " + topPhy.name + ")");
		System.out.println("Max Chemistry: " + maxChe + " (Student: " + topChe.name + ")");
		System.out.println("Max Math: " + maxMath + " (Student: " + topMath.name + ")");
	}
	
	static void max_total_number(Students s[]) {
		
		double max_total = s[0].m.total();
		String top_students = s[0].name;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].m.total() > max_total) {
				max_total = s[i].m.total();
				top_students = s[i].name;
			}
		}
		System.out.println("\n The Student name is - "+ top_students + " || The total Number is - " + max_total);
	}
	
	static void students_gread(Students s[]) {
		
		double persentage;
		char greads;
		for(int i = 0; i < s.length; i++) {
			persentage = (s[i].m.total() / 100) * 100;
			
			if(s[i].m.total() >= 90 && s[i].m.total() <= 100) {
				greads = 'O';
			}
			else if(s[i].m.total() >= 80 && s[i].m.total() <= 89) {
				greads = 'E';
			}
			else if(s[i].m.total() >= 65 && s[i].m.total() <= 79) {
				greads = 'A';
			}
			else if(s[i].m.total() >= 50 && s[i].m.total() <= 64) {
				greads = 'B';
			}
			else {
				greads = 'F';
			}
			
	        System.out.println("Student: " + s[i].name);
	        System.out.println("Total Marks: " + s[i].m.total() + "/300");
	        System.out.println("Grade: " + greads + " Persentage: " + persentage);
		}
	}

}
