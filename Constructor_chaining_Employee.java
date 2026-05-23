import java.util.*;

// from main method take n No of employee details 

class Employee{
	String id;
	String name;
	int sal;
	String com;
	String cont; 
	String scont;
	String email; 
	String dob;	
	
	Employee(String name, int sal, String Com, String cont) {
		this.name = name;
		this.sal = sal;
		this.com = Com;
		this.cont = cont;
		
		this.id=""+name.charAt(0);
		int i=1;
		while(name.charAt(i)!=' ')
		{
			i++;
		}
		this.id=this.id+name.charAt(i+1);
		this.id+=cont.charAt(0);
		this.id+=cont.substring(6);
		
		
		this.scont = "0000000000";
		this.email = "null@gmail.com";
		this.dob = "00-00-0000";
	}
	Employee(String name, int sal, String com, String cont, String scont) {
		this(name, sal, com, cont);
		this.scont=scont;
	}
	Employee(String name, int sal, String com, String cont, String scont, String email) {
		this(name, sal, com, cont, scont);
		this.email=email;
	}
	Employee(String name, int sal, String com, String cont, String scont, String email, String dob) {
		this(name, sal, com, cont, scont, email);
		this.dob=dob;
	}

}

public class Constructor_chaining_Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();sc.nextLine();
		Employee[] a = new Employee[n];
		
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("			Enter Details of Employee " + (i + 1) + ":");
			System.out.println("--------------------------------------------------------------------");
			
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter Salary: ");
			int sal = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Company: ");
			String com = sc.nextLine();
			
			String cont=null;
			do {
				System.out.println("Enter Primary Contact No: ");
				cont = sc.nextLine();
				if(cont.length()==10)
					break;
				else
					System.out.println("<Invalid COntact Number>  :::  Re-enter again !!");
			}while(true);
			
			
			
			System.out.println("Do you want to give your secondary contact no ? Y/N ");
			char c = sc.nextLine().charAt(0);
			String scont=null;
			if(c=='y')
			{
				do {
					System.out.println("Enter Secondary Contact No: ");
					scont = sc.nextLine();
					if(scont.length()==10)
						break;
					else
						System.out.println("<Invalid COntact Number>  :::  Re-enter again !!");
				}while(true);
			}
			
			System.out.println("Do you want to give your email id ? Y/N ");
			char c1 = sc.nextLine().charAt(0);
			String email=null;
			if(c1=='y')
			{
				do {
					System.out.println("Enter email id: ");
					email = sc.nextLine();
					int j=0;
					while(email.charAt(j)!='@')
					{
						j++;
					}
					String e=email.substring(j+1);
					if(e.equalsIgnoreCase("gmail.com") || e.equalsIgnoreCase("yahoo.com") || e.equalsIgnoreCase("outlook.com"))
					{
						System.out.println("-----< Email verified >----");
						break;
					}
					else
						System.out.println("<Invalid email id>  :::  Re-enter again !!");
					
				}while(true);
			}
			
			System.out.println("Do you want to register your DOB ? Y/N ");
			char c2 = sc.nextLine().charAt(0);
			String dob=null;
			if(c2=='y')
			{
				do {
					System.out.println("Enter DOB : ");
					dob = sc.nextLine();
					int j=0;
					if(dob.length()==10 && dob.charAt(2)=='-' && dob.charAt(5)=='-')
					{
						System.out.println("-----<  Successfully Registered your DOB  >--------");
						break;
					}
					else
						System.out.println("<Invalid email id>  :::  Re-enter again !!");
					
				}while(true);
			}
			
			if(c=='y' && c1=='y' && c2=='y')
			{
				a[i]=new Employee(name, sal, com, cont, scont, email, dob);
			}
			else if(c=='y' && c1=='y')
			{
				a[i]=new Employee(name, sal, com, cont, scont, email);
			}
			else if(c=='y')
			{
				a[i]=new Employee(name, sal, com, cont, scont);
			}
			else
			{
				a[i]=new Employee(name, sal, com, cont);
			}
		}
		show(a);
		show_A(a);

	}
	static void show(Employee a[]) 
	{
		System.out.println("         ::::: Employee Details :::::     ");
		System.out.println("--------------------------------------------------------");
		for (Employee e : a) 
		{
			System.out.println("Employee ID: " + e.id);
			System.out.println("Name: " + e.name);
			System.out.println("Salary: " + e.sal);
			System.out.println("Company: " + e.com);
			System.out.println("Primary Contact No: " + e.cont);
			System.out.println("Secondary Contact No: " + e.scont);
			System.out.println("Email: " + e.email);
			System.out.println("DOB: " + e.dob);
			System.out.println();
		}
	}
	
	
	static void show_A(Employee emp[]) {
		System.out.println("Employee Details with valid email id :  ");
		System.out.println("----------------------------------------------------");
		for (Employee e : emp)
		{
			String em="";
			int i=0;
			while(e.email.charAt(i)!='@')
			{
				em=em+e.email.charAt(i);
				i++;
			}
			if(em.equals("null"))
			{
				System.out.println("Employee ID: " + e.id);
				System.out.println("Name: " + e.name);
				System.out.println("Salary: " + e.sal);
				System.out.println("Company: " + e.com);
				System.out.println();
			}
		}
		
		
	}
	
}

