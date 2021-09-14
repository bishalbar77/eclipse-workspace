package pmec_oops;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Students : ");
		int n = sc.nextInt();
		int age[] = new int[n];
		String name[]= new String[n], collegeName[]=  new String[n], department[]= new String[n], semester[]= new String[n], rollNumber[] = new String[n], dob[]= new String[n], superscript= null;
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
			System.out.println("Enter the roll number of "+temp+""+superscript+" Student :");
			rollNumber[i] = sc.nextLine();
			System.out.println("Enter the name of "+temp+""+superscript+" Student :");
			name[i] = sc.nextLine();
			System.out.println("Enter the college name of "+temp+""+superscript+" Student :");
			collegeName[i] = sc.nextLine();
			System.out.println("Enter the department of "+temp+""+superscript+" Student :");
			department[i] = sc.nextLine();
			System.out.println("Enter the semester of "+temp+""+superscript+" Student :");
			semester[i] = sc.nextLine();
			System.out.println("Enter the date of birth of "+temp+""+superscript+" Student :");
			dob[i] = sc.nextLine();
			System.out.println("Enter the age of "+temp+""+superscript+" Student :");
			age[i] = sc.nextInt();
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
			System.out.println("The roll number of "+temp+""+superscript+" Student : "+rollNumber[i]);
			System.out.println("The name of "+temp+""+superscript+" Student : "+name[i]);
			System.out.println("The college name of "+temp+""+superscript+" Student : "+collegeName[i]);
			System.out.println("The department of "+temp+""+superscript+" Student : "+department[i]);
			System.out.println("The semester of "+temp+""+superscript+" Student : "+semester[i]);
			System.out.println("The date of birth of "+temp+""+superscript+" Student : "+dob[i]);
			System.out.println("The age of "+temp+""+superscript+" Student : "+age[i]);
			System.out.println();
		}
		System.out.println();
				
	}

}
