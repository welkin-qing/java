package second;

import java.util.Scanner;

class StudentInfo{
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void sort(StudentInfo[] stu,int count) {
		StudentInfo flag;
		for(int i=0; i< count; i++) {
			for(int j=i;j<count;j++) {
				if(stu[i].getScore()>stu[j].getScore()) {
					flag = stu[i];
					stu[i]=stu[j];
					stu[j]=flag;
				}
			}
		}
	}
	public void print(StudentInfo[] stu,int count) {
		for(int i=0;i<count;i++) {
			System.out.println(stu[i].getName()+ " "+stu[i].getScore());
		}
	}
}
public class test3 {

	private static Scanner input;
	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s = new StudentInfo();
		StudentInfo[] stu= new StudentInfo[20];
		input = new Scanner(System.in);
		System.out.println("������ѧ������:");
		int count = input.nextInt();
		int flag=0;
		while(flag<count) {
			System.out.println("�������"+(flag+1)+"��ѧ���������ͷ�����");
			scan = new Scanner(System.in);
			String strLine = scan.nextLine();
			String[] strLineArr = strLine.split(" ");//�ָ�
			StudentInfo st = new StudentInfo();
			st.setName(strLineArr[0]);
	        st.setScore(Integer.parseInt(strLineArr[1]));
	        stu[flag]=st;
            flag++;
		}
		s.sort(stu, count);
		System.out.println("������ѧ����ϢΪ:");
		s.print(stu, count);
	}

}
