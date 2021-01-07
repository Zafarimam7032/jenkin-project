package pojo;

import java.util.Scanner;



public class StudentData {
	
	int y;
	
	public static void main(String [] a)
	{
		Scanner s=new Scanner(System.in);
		StudentData obj1=new StudentData();
		
		System.out.print("please enter how many Student Data do you want to inseart:");
		int n=s.nextInt();
		int [] id=new int[n];
		String [] name=new String[n];
		String [] city=new String[n];
		String [] roll=new String[n];
		Student obj=new Student();
		for(int i=0;i<n;i++)
		{
			int k=i+1;
			System.out.println("enter the "+k+" student details");
			System.out.print("Student id");
			obj.setId(s.nextInt());
			s.nextLine();
			System.out.print("Name:");
			obj.setName(s.nextLine());
			System.out.print("City:");
			obj.setCity(s.nextLine());
			System.out.print("RollNo:");
			obj.setRollNo(s.nextLine());
			id[i]=obj.getId();
			name[i]=obj.getName();
			city[i]=obj.getCity();
			roll[i]=obj.getRollNo();
		
		}
		System.out.print("you want to use specific dispaly data if yes then press '1' otherwise press any number:");
		int v=s.nextInt();
		if(v==1) {
		System.out.println("\n forloop press '1' or while loop pres '2' or dowhile press '3':");
		obj1.y=s.nextInt();
		}
		
	
		
		switch(obj1.y) {
		case 1:
		System.out.println("data displaying by using for loop");
		for(int j=0;j<n;j++)
		{
			int l=j+1;
			System.out.print(" student "+l+" details");
			
			System.out.println("id:"+id[j]);
			System.out.println("name:"+name[j]);
			System.out.println("city:"+city[j]);
			System.out.println("roll number:"+ roll[j]);
		}
		break;
		case 2:
			System.out.println("data displaying by using while loop");
		int m=0;
		while(m<n)
		{
			int l=m+1;
			System.out.print(" student "+l+" details");
			
			System.out.println("id:"+id[m]);
			System.out.println("name:"+name[m]);
			System.out.println("city:"+city[m]);
			System.out.println("roll number:"+ roll[m]);
			m++;
		}
		
		break;
		case 3:
			System.out.println(" data displaying by using [-do while loop");
			int z=0;
		do
		{
			int l=z+1;
			System.out.print(" student "+l+" details");
			
			System.out.println("id:"+id[z]);
			System.out.println("name:"+name[z]);
			System.out.println("city:"+city[z]);
			System.out.println("roll number:"+ roll[z]);
			z++;
			
		}
		while(z<n);
		break;
		default :
		for(int j=0;j<n;j++)
		{
			int l=j+1;
			System.out.print(" student "+l+" details");
			
			System.out.println("id:"+id[j]);
			System.out.println("name:"+name[j]);
			System.out.println("city:"+city[j]);
			System.out.println("roll number:"+ roll[j]);
		}
			
			
	}
	}

}
