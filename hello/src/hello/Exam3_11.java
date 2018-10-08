package hello;

public class Exam3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,m=0;
		while(n<=4) {
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=4;j++) {
					if(n!=i && n!=j && i!=j) {
						m+=1;
						System.out.print(n*100+i*10+j+"  ");
						if((m)%5==0) {
							System.out.println();
						}
					}
				}
			}
			n++;
		}
		System.out.println();
		System.out.println(m);
	}

}
