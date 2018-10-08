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
		System.out.println("学号为:"+number+","+
							"姓名为:"+name+","+
							"年龄为:"+age+","+
							"成绩为："+score+","+
							"学校为:"+school+",");
	}
}*/
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第一个学生的信息：学号-姓名-年龄-成绩-学校");
		//System.out.println("");
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		String name1 = in.next();
		int age1 = in.nextInt();
		int score1 = in.nextInt();
		String school1 = in.next();
		System.out.println("请输入第二个学生的信息：学号-姓名-年龄-成绩-学校");
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
		System.out.println("学号为:"+s1.getNumber()+","+
				"姓名为:"+s1.getName()+","+
				"年龄为:"+s1.getAge()+","+
				"成绩为："+s1.getScore()+","+
				"学校为:"+s1.getSchool()+",");
		System.out.println("学号为:"+s2.getNumber()+","+
				"姓名为:"+s2.getName()+","+
				"年龄为:"+s2.getAge()+","+
				"成绩为："+s2.getScore()+","+
				"学校为:"+s2.getSchool()+",");
		double num = (s1.getScore()+s2.getScore())/2.0;
		System.out.println("平均成绩为:");
		System.out.printf("%.1f", num);
		//System.out.println(String.format("%.1f",(s1.getScore()+s2.getScore())/2 ));
	}
	//System.out.println("");
	//double num = (s1.getScore()+s2.getScore())/2;
	//System.out.println("平均成绩为:"+(s1.getScore()+s2.getScore())/2);
}
