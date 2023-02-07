package com.derin;

import java.util.ArrayList;

public class MyProgram {

	public static void main(String[] args)
	{
		//Student.creating();
		
		/*Student.inserting("Derin","Java","dk@gmail.com");
		Student.inserting("Shafi","Phyton","sk@gmail.com");
		Student.inserting("Harish",".net", "hari@gmail.com");*/
		
		//Student.update(3, "har@gmail.com", "Testing");
		
		//Student.delete(3);
		
		//Student.read();
		
		/*Student1 res=Student.read();
		System.out.println(res.getNo());
		System.out.println(res.getName());
		System.out.println(res.getSub());
		System.out.println(res.getEmail());*/
		
		ArrayList<Student1> a=Student.getAllData();
		for(Student1 d: a) {
			System.out.print(d.getNo() +" ");
			System.out.print(d.getName() +" ");
			System.out.print(d.getSub() +" ");
			System.out.println(d.getEmail());
		}
						
	}

}
