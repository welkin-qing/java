package fourth;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class fourth4_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    List list = new ArrayList();
	    System.out.println("请输入贷款金额====");
	    Loan loan = new Loan(in.nextDouble());
	    list.add(loan);
	    System.out.println("请输入时间字符串====");
	    Mydate1 mydate = new Mydate1(in.next());
	    list.add(mydate);
	    System.out.println("请输入标签字符串====");
	    JFrame frame = new JFrame(in.next());
	    System.out.println("请输入圆的半径====");
	    Circle circle = new Circle(in.nextInt());
	    for (int i = 0; i < list.size(); i++) {
	       System.out.println(list.get(i).toString());
	    }
	    return ;
	}

}
//Loan类
class Loan {
	private Double loan;

	public Loan(Double loan) {// 构造方法赋值 也可以使用set 方法
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Loan:" + loan;
	}
}
//Mydate 类
class Mydate1 {
	private String date;

	public Mydate1(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Date:" + date;
	}
}
//JFrame
class JFrame{
	private String framName;
	public JFrame(String framName) {
		this.framName = framName;
	}
	public String toString() {
		return "framName:" + framName;
	}
}
//Circle
class Circle{
	private double r;
	public Circle(int r) {
		this.r = r;
	}
	public String toString() {
		return "circle的半径是:" + r;
	}
}
