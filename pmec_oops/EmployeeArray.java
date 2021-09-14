package pmec_oops;
import java.util.Scanner;

class EmployeesData{
	int age[] = new int[100];
	String name[]= new String[100], empId[]=  new String[100], department[]= new String[100], address[]= new String[100], salary[] = new String[100], doj[]= new String[100];
}
public class EmployeeArray 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Employees : ");
		int n = sc.nextInt();
		EmployeesData ed = new EmployeesData();
		String superscript= null;
		for(int i =0;i<n;i++)
		{
			int temp=i+1;
			if(i==0)
			{
				superscript = "st";
			}
			else if(i==1)
			{
				superscript = "nd";
			}
			else
			{
				superscript = "rd";
			}
			sc.nextLine();
			System.out.println("Enter the Employee ID of "+temp+""+superscript+" Employee :");
			ed.empId[i] = sc.nextLine();
			System.out.println("Enter the name of "+temp+""+superscript+" Employee :");
			ed.name[i] = sc.nextLine();
			System.out.println("Enter the salary of "+temp+""+superscript+" Employee :");
			ed.salary[i] = sc.nextLine();
			System.out.println("Enter the department of "+temp+""+superscript+" Employee :");
			ed.department[i] = sc.nextLine();
			System.out.println("Enter the address of "+temp+""+superscript+" Employee :");
			ed.address[i] = sc.nextLine();
			System.out.println("Enter the date of joining of "+temp+""+superscript+" Employee :");
			ed.doj[i] = sc.nextLine();
			System.out.println("Enter the age of "+temp+""+superscript+" Employee :");
			ed.age[i] = sc.nextInt();
			System.out.println();
		}
		for(int i =0;i<n;i++)
		{
			int temp=i+1;
			if(i==0)
			{
				superscript = "st";
			}
			else if(i==1)
			{
				superscript = "nd";
			}
			else
			{
				superscript = "rd";
			}
			System.out.println("The employee ID of "+temp+""+superscript+" Employee : "+ed.empId[i]);
			System.out.println("The name of "+temp+""+superscript+" Employee : "+ed.name[i]);
			System.out.println("The salary of "+temp+""+superscript+" Employee : "+ed.salary[i]);
			System.out.println("The department of "+temp+""+superscript+" Employee : "+ed.department[i]);
			System.out.println("The address of "+temp+""+superscript+" Employee : "+ed.address[i]);
			System.out.println("The date of joining of "+temp+""+superscript+" Employee : "+ed.doj[i]);
			System.out.println("The age of "+temp+""+superscript+" Employee : "+ed.age[i]);
			System.out.println();
		}
		System.out.println();	
	}
}
