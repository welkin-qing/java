package third;

import java.util.Arrays;
import java.util.Scanner;

public class third2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数组个数：");
		int n = in.nextInt();
		int a[] =new int [n];
		System.out.println("请输入数组元素：");
		for(int i=0; i<n; i++) {
			int z = in.nextInt();
			a[i] = z;
		}
		int b[] = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		/*for(int i=0; i<b.length;i++) {
			System.out.print(b[i] + " ");
		}*/
		System.out.println("输出b为：");
		System.out.println(Arrays.toString(b));
		/*for(int b1 : b) {
			System.out.print(b1+" ");
		}*/
	}

}
