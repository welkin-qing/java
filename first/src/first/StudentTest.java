package first;

import java.util.Scanner;
//import java.text.DecimalFormat;  
class Student{
	private int number; 
	private String name;
	private int age;
	private int score;
	private String school;
	public void setNumber(int n) {
		number = n;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String na) {
		name = na;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setScore(int s) {
		score = s;
	}
	public int getScore() {
		return score;
	}
	public void setSchool(String sch) {
		school = sch;
	}
	public String getSchool() {
		return school;
	}
}

/*
class Student{
	int number; 
	String name;
	int age;
	int score;
	String school;
	void setStudent(int number,String name,int age,int score,String school)
	{
		this.number = number;
		this.name = name;
		this.age = age;
		this.score = score;
		this.school = school;
	}
	void introduce() {
		System.out.println("ѧ��Ϊ:"+number+","+
							"����Ϊ:"+name+","+
							"����Ϊ:"+age+","+
							"�ɼ�Ϊ��"+score+","+
							"ѧУΪ:"+school+",");
	}
}*/
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������һ��ѧ������Ϣ��ѧ��-����-����-�ɼ�-ѧУ");
		//System.out.println("");
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		String name1 = in.next();
		int age1 = in.nextInt();
		int score1 = in.nextInt();
		String school1 = in.next();
		System.out.println("������ڶ���ѧ������Ϣ��ѧ��-����-����-�ɼ�-ѧУ");
		//System.out.println("");
		int number2 = in.nextInt();
		String name2 = in.next();
		int age2 = in.nextInt();
		int score2 = in.nextInt();
		String school2 = in.next();
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setNumber(number1);
		s1.setName(name1);
		s1.setAge(age1);
		s1.setScore(score1);
		s1.setSchool(school1);
		
		s2.setNumber(number2);
		s2.setName(name2);
		s2.setAge(age2);
		s2.setScore(score2);
		s2.setSchool(school2);
		System.out.println("ѧ��Ϊ:"+s1.getNumber()+","+
				"����Ϊ:"+s1.getName()+","+
				"����Ϊ:"+s1.getAge()+","+
				"�ɼ�Ϊ��"+s1.getScore()+","+
				"ѧУΪ:"+s1.getSchool()+",");
		System.out.println("ѧ��Ϊ:"+s2.getNumber()+","+
				"����Ϊ:"+s2.getName()+","+
				"����Ϊ:"+s2.getAge()+","+
				"�ɼ�Ϊ��"+s2.getScore()+","+
				"ѧУΪ:"+s2.getSchool()+",");
		double num = (s1.getScore()+s2.getScore())/2.0;
		System.out.println("ƽ���ɼ�Ϊ:");
		System.out.printf("%.1f", num);
		//System.out.println(String.format("%.1f",(s1.getScore()+s2.getScore())/2 ));
	}
	//System.out.println("");
	//double num = (s1.getScore()+s2.getScore())/2;
	//System.out.println("ƽ���ɼ�Ϊ:"+(s1.getScore()+s2.getScore())/2);
}
