package welkin;

import java.util.Scanner;

class Person {
	String name, address, tel, email;

	public Person(String name, String address, String tel, String email) {
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}

	public String toString() {
		return "name:" + name + " address:" + address + " tel:" + tel + " email:" + email;
	}
}

class Student extends Person {
	private String status;

	public Student(String name, String address, String tel, String email, String status) {
		super(name, address, tel, email);
		// TODO Auto-generated constructor stub
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}

class MyDate {
	public int year;
	public int month;
	public int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}

class Employee extends Person {
	private String office;
	protected double Salary;
	static MyDate mydate;
	private int year;
	private int month;
	private int day;

	public void MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public Employee(String name, String address, String tel, String email, String office, double Salary, MyDate date) {
		super(name, address, tel, email);
		// TODO Auto-generated constructor stub
		this.office = office;
		this.Salary = Salary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public MyDate getMyDate() {
		return mydate;
	}

	public void setMyDate(MyDate mydate) {
		this.mydate = mydate;
	}

	public String toString() {
		return super.toString() + "ְλ" + office + " ����" + Salary + " ��Ƹ����" + mydate.year + "�� " + mydate.month + "��"
				+ mydate.day + "��";
	}
}

class Staff extends Employee {
	private String staff;

	public Staff(String name, String address, String tel, String email, String office, double Salary, MyDate date,
			String staff) {
		super(name, address, tel, email, office, Salary, mydate);
		// TODO Auto-generated constructor stub
		this.staff = staff;
	}

	public String getStaff() {
		return staff;
	}

	public String toString() {
		return super.toString()+"ְ��"+staff;
	}
}

class Faculty extends Employee {
	private String faculty;

	public Faculty(String name, String address, String tel, String email, String office, double Salary,
			welkin.MyDate date, String faculty) {
		super(name, address, tel, email, office, Salary, date);
		// TODO Auto-generated constructor stub
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}
	public String toString() {
		return super.toString()+"ְ��"+faculty;
	}

}

public class fourth2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student n1 = new Student("����", "����", "5582779", "5582779@123", "����");
		System.out.println(n1.toString());
		MyDate t1 = new MyDate(2018, 9, 23);
		Staff n2 = new Staff("����","�Ϻ�","18392887", "156456@4564", "�칫��", 1800,t1, "ְ��" );
		System.out.println(n2.toString());
		MyDate t2 = new MyDate(2015, 1, 12);
		Faculty n3 = new Faculty("����", "����", "15645641", "156156@253", "�칫��", 2500, t2, "�̹�");
		System.out.println(n3.toString());
	}

}

