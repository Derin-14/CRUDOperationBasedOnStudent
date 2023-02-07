package com.palle;

import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) 
	{
		int eno=0;
		String ename=null;
		int esal=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press the following numbers to do CRUD operation\n"
				+ "Press 1-To create table\n"
				+ "Press 2-To Insert a row into table\n"
				+ "Press 3-To Update the table data\n"
				+ "Press 4-To Delete the table data\n"
				+ "Press 5-To Exit");
		int num1=sc.nextInt();
		if(num1==1)
		{
			Employee.creating();
			System.out.println("Table is created");
		}
		
		int num2=sc.nextInt();
		if(num2==2)
		{
			System.out.println("Enter ename in String and esal in int");
			Employee.insert(ename=sc.next(),esal=sc.nextInt());
			Employee.insert(ename=sc.next(),esal=sc.nextInt());
			Employee.insert(ename=sc.next(),esal=sc.nextInt());	
		}
		
		int num3=sc.nextInt();
		if(num3==3)
		{
			System.out.println("Enter eno in int,ename in String and esal in int for update");
			Employee.update(eno=sc.nextInt(),ename=sc.next(),esal=sc.nextInt());
		}

		int num4=sc.nextInt();
		if(num4==4)
		{
			System.out.println("Enter eno in int for delete");
			Employee.delete(eno=sc.nextInt());
		}
		
		int num5=sc.nextInt();
		if(num5==5)
		{
			System.out.println("Exit...");
			System.exit(0);
		}
	}

}
