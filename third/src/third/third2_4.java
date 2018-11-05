package third;

import java.util.Random;

public class third2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random(1000); 
		for(int i = 0; i < 50; i++) {
			System.out.print(rd.nextInt(100) + "\t");
			if(i%10 == 9) {
				System.out.print("\n");
			}
		}

			
		//System.out.print("\n");
		
	}

}
