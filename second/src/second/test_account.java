package second;

import java.util.Scanner;

class Account{
	private int[] count={100,100,100,100,100,100,100,100,100,100};
	public void cun(int qian,int i) {
		count[i]=count[i]+qian;
	}
	public void qu(int qian,int i) {
		if(qian>count[i]) {
			System.out.println("�Բ����������㣡");
			return;
		}else {
			count[i] = count[i]-qian;
		}
		
	}
	public void menu() {
		System.out.println("1-��ѯ");
		System.out.println("2-ȡǮ");
		System.out.println("3-��Ǯ");
		System.out.println("4-�˳�");
	}
	public void chaxun(int i) {
		System.out.println(count[i]);
	}
}
public class test_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account s = new Account();
		System.out.println("������ID��");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		if(id >10) {
			System.out.println("�����ID�������������룡");
			id = in.nextInt();
		}
		int choice;
		s.menu();
		System.out.println("����������ѡ��");
		choice = in.nextInt();
		switch(choice) {
		case 1: s.chaxun(id);
				s.menu();
				choice = in.nextInt();break;
		case 2: System.out.println("������Ҫȡ��Ǯ��");
				int qian = in.nextInt();
				s.qu(qian, id-1);
				s.menu();
				choice = in.nextInt();break;
		case 3: System.out.println("������Ҫ���Ǯ��");
				qian = in.nextInt();
				s.cun(qian, id-1);
				s.menu();
				choice = in.nextInt();break;
		case 4: System.out.println("ллʹ�ã�");return;
		}*/
		// TODO Auto-generated method stub
				Account s = new Account();
				Scanner in = new Scanner(System.in);
				int id = 0;
				do {
					System.out.println("������ID��");
					id = in.nextInt();
					if (id > 10 || id < 0)
						System.out.println("�����ID�������������룡");

				} while (id > 10 || id < 0);

				int choice = 0;
				do {
					s.menu();
					System.out.printf("����������ѡ��");
					choice = in.nextInt();
					switch (choice) {
					case 1:
						s.chaxun(id-1);
						break;
					case 2:
						System.out.println("������Ҫȡ��Ǯ��");
						int qian = in.nextInt();
						s.qu(qian, id - 1);
						break;
					case 3:
						System.out.println("������Ҫ���Ǯ��");
						qian = in.nextInt();
						s.cun(qian, id - 1);
						break;
					case 4:
						System.out.println("ллʹ�ã�");
						return;
					}
				} while (choice != 4);
	}

}
