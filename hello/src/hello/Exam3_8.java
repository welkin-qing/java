package hello;

public class Exam3_8 {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		while(x < 100/3) {
			int y=0;
			while(y<100/2) {
				int z;
				z=100-x-y;
				if(z%2==0 && 3*x+2*y+z/2 == 100) {
					System.out.println("大马数：" + x +",中马数" + y +",小马数"+z);
				}
				++y;
			}
			++x;
		}
	}*/
	public static void main(String[] args) {
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				int z=100-x-y;
				if(z%2==0 && 3*x+2*y+z/2 == 100) {
					System.out.println("大马数：" + x +",中马数" + y +",小马数"+z);
				}
			}
		}
	}
}
