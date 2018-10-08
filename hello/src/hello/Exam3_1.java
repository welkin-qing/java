package hello;
import java.util.Scanner;
public class Exam3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c,f=0.0f;
		System.out.println("");
		Scanner in=new Scanner(System.in);
		System.out.println("请输入摄氏温度：");
		c=in.nextFloat();
		f=c*9/5+32;
		System.out.println("转换成华氏温度为："+f);
	}

}
