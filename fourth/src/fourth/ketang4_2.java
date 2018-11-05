package fourth;

import java.util.*;
import java.lang.*;


public class ketang4_2 {
//	public static Object max(Comparable[] a) {
//		Comparable max = a[0];
//		for(int i=0; i<a.length; i++) {
//			max = (max.compareTo(a[i]) > 0) ? max : a[i];
//		}
		  public static Object max(Comparable[] a){
		        Arrays.sort(a);
		        return a[a.length-1];
		    }
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String []str = new String[5];
		Integer []ints = new Integer[5];
		for(int i=0; i<5; i++) {
			str[i] = input.nextLine();
		}
		for(int i=0; i<5; i++) {
			ints[i] = input.nextInt();
		}
		System.out.println("Max string is " + max(str));
        System.out.println("Max integer is " + max(ints));
	}

}
