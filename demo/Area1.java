import java.util.Scanner;
import java.text.DecimalFormat;  

public class Area1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println(String.format("%.4f", a*a*Math.sqrt(25+10*Math.sqrt(5))/4));
		DecimalFormat df1 = new DecimalFormat("#.####");
		System.out.println(df1.format(a*5));
	}
}