package fourth;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class fourth4_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    List list = new ArrayList();
	    System.out.println("�����������====");
	    Loan loan = new Loan(in.nextDouble());
	    list.add(loan);
	    System.out.println("������ʱ���ַ���====");
	    Mydate1 mydate = new Mydate1(in.next());
	    list.add(mydate);
	    System.out.println("�������ǩ�ַ���====");
	    JFrame frame = new JFrame(in.next());
	    System.out.println("������Բ�İ뾶====");
	    Circle circle = new Circle(in.nextInt());
	    for (int i = 0; i < list.size(); i++) {
	       System.out.println(list.get(i).toString());
	    }
	    return ;
	}

}
//Loan��
class Loan {
	private Double loan;

	public Loan(Double loan) {// ���췽����ֵ Ҳ����ʹ��set ����
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Loan:" + loan;
	}
}
//Mydate ��
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
		return "circle�İ뾶��:" + r;
	}
}
