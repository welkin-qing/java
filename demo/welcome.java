import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!What's your name?");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println(name+",Welcome to learn OOP using C++!");
	}
}