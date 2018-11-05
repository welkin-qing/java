package fifth;

import java.util.Scanner;

class Resource {
	public void open(String a) {

	}
	public void close() {

	}
}

public class keqian5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Resource resource = null;
		try {
			resource = new Resource();
			resource.open(sc.nextLine());
			/* 这里放置你的答案 */
			
			System.out.println("resource open success");
			
			resource.close();
			
			System.out.println("resource release success");
		} catch (RuntimeException e) {

			System.out.println(e);

			System.out.println("resource release success");

		} catch (Exception e) {

			System.out.println("resource open success");

			System.out.println(e);
		}
		

		sc.close();
		sc.close();
	}

}
