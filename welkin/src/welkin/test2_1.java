package welkin;

import java.util.Scanner;
class Student{// ����ѧ����
	private String name;
	private int age;
	private String education;

	Student(String name, int age, String education) {
		this.name = name;
		this.age = age;
		this.education = education;
	}

	public void show() {
		System.out.println("����   : " + name + " ����   :  " + age + " ѧ��   : " + education);
	}
}

class Undergraduate extends Student {// ��ѧ��������������
	private String specialty;

	Undergraduate(String name, int age, String education, String spe) {
		super(name, age, education);
		// TODO Auto-generated constructor stub
		this.specialty = spe;
	}

	public void show() {
		super.show();
		System.out.println("רҵ  : " + specialty);
	}

}

class Graduate extends Student {
	private String direction;

	Graduate(String name, int age, String education, String dir) {
		super(name, age, education);
		// TODO Auto-generated constructor stub
		this.direction = dir;
	}

	public void show() {
		super.show();
		System.out.println("�о�����   :  " + direction);
	}
}

public class test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name1 = input.next();
		int age1 = input.nextInt();
		String eduction1 = input.nextLine();
		Student s1 = new Student(name1, age1, eduction1);
		s1.show();
		System.out.println("------------------------");

		String name2 = input.next();
		int age2 = input.nextInt();
		String eduction2 = input.next();
		String specialty = input.nextLine();
		Undergraduate s2 = new Undergraduate(name2, age2, eduction2, specialty);
		s2.show();
		System.out.println("------------------------");

		String name3 = input.next();//name
		int age3 = input.nextInt();//22
		String education3 = input.next();//�о���
		String direction3 = input.nextLine();//
	
		Graduate s3 = new Graduate(name3, age3, education3, direction3);
		s3.show();
	}

}
