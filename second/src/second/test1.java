package second;
//�ж��ظ�
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a={10,3,1,3,53,23,232,90,21,33};
		System.out.println("������һ������");
		int n = in.nextInt();
		int i=0;
		for(i = 0;i<a.length;i++) {
			if(n == a[i]) {
				System.out.println(i+1);
			}
		}
		if(i >= a.length) {
			System.out.println("���ڸ�������");
		}
	}

}
