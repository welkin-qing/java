package fifth;

public class ketang5_2 {

	public static void main(String[] args) {
		String s = "hello";
		try {
			s = s+" world";
			s.toUpperCase();
			String[] a = s.split("o");
			System.out.println(a.length);
		} catch (Exception e) {
			System.out.print(s);
		} finally {
			System.out.print(s);
}}

}
