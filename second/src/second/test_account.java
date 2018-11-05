package second;

import java.util.Scanner;

class Account{
	private int[] count={100,100,100,100,100,100,100,100,100,100};
	public void cun(int qian,int i) {
		count[i]=count[i]+qian;
	}
	public void qu(int qian,int i) {
		if(qian>count[i]) {
			System.out.println("对不起，您的余额不足！");
			return;
		}else {
			count[i] = count[i]-qian;
		}
		
	}
	public void menu() {
		System.out.println("1-查询");
		System.out.println("2-取钱");
		System.out.println("3-存钱");
		System.out.println("4-退出");
	}
	public void chaxun(int i) {
		System.out.println(count[i]);
	}
}
public class test_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account s = new Account();
		System.out.println("请输入ID：");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		if(id >10) {
			System.out.println("您输的ID有误，请重新输入！");
			id = in.nextInt();
		}
		int choice;
		s.menu();
		System.out.println("请输入您的选择：");
		choice = in.nextInt();
		switch(choice) {
		case 1: s.chaxun(id);
				s.menu();
				choice = in.nextInt();break;
		case 2: System.out.println("请输入要取的钱：");
				int qian = in.nextInt();
				s.qu(qian, id-1);
				s.menu();
				choice = in.nextInt();break;
		case 3: System.out.println("请输入要存的钱：");
				qian = in.nextInt();
				s.cun(qian, id-1);
				s.menu();
				choice = in.nextInt();break;
		case 4: System.out.println("谢谢使用！");return;
		}*/
		// TODO Auto-generated method stub
				Account s = new Account();
				Scanner in = new Scanner(System.in);
				int id = 0;
				do {
					System.out.println("请输入ID：");
					id = in.nextInt();
					if (id > 10 || id < 0)
						System.out.println("您输的ID有误，请重新输入！");

				} while (id > 10 || id < 0);

				int choice = 0;
				do {
					s.menu();
					System.out.printf("请输入您的选择：");
					choice = in.nextInt();
					switch (choice) {
					case 1:
						s.chaxun(id-1);
						break;
					case 2:
						System.out.println("请输入要取的钱：");
						int qian = in.nextInt();
						s.qu(qian, id - 1);
						break;
					case 3:
						System.out.println("请输入要存的钱：");
						qian = in.nextInt();
						s.cun(qian, id - 1);
						break;
					case 4:
						System.out.println("谢谢使用！");
						return;
					}
				} while (choice != 4);
	}

}
