package second;

import java.util.Scanner;

// �ж����������Ƿ��ظ�
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("���������������");
		int n = in.nextInt();
		int []a = new int [n];
		int []b = new int [n];
		System.out.println("���һ���������ݣ�");
		for(int i=0; i<a.length; i++) {
			int z = in.nextInt();
			a[i] = z;
		}
		System.out.println("��ڶ����������ݣ�");
		for(int i=0; i<n; i++) {
			int c = in.nextInt();
			b[i] = c;
		}
		System.out.println("a����:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("b����:");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		int j=0;
		for(j=0; j<n; j++) {
			if(a[j] != b[j]) {
				System.out.println("�������鲻һ����");break;
			}
		}
		if(j>=n) {
			System.out.println("��������һ����");
		}
	}

}
