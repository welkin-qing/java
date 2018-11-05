package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class PersonOverride{
	private String name;
	private int age;
	private boolean gender;
	
	public PersonOverride() {
		this("default", 1, true);
	}

	public PersonOverride(String name, int age, boolean gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return name + "-"+age + "-" + gender;
	}
	public boolean equals(Object o) {
		PersonOverride rfs = (PersonOverride) o;
		if((this.age == rfs.age) && (this.name == rfs.name) && (this.gender == rfs.gender)) {
			return true;
		}else {
			return false;
		}
	}
}
public class keqian4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		ArrayList<PersonOverride> person1 = new ArrayList<PersonOverride>();
		for(int i=0; i<n1; i++) {
			person1.add(new PersonOverride());
		}
		
		int n2 = input.nextInt();
		ArrayList<PersonOverride> person2 = new ArrayList<PersonOverride>();
		for(int i=0; i<n2; i++) {
			String t_name = input.next();
			int t_age = input.nextInt();
			
			String tt = input.next();
			boolean t_gender = Boolean.valueOf(tt);
			PersonOverride tmp = new PersonOverride(t_name, t_age, t_gender);
			
			if(!person2.contains(tmp)) {
				person2.add(tmp);
			}
		}
		for(PersonOverride number : person1) {
			System.out.println(number.toString());
		}
		for(PersonOverride number : person2) {
			System.out.println(number.toString());
		}
		System.out.println(person2.size());
		System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
		input.close();
	}

}
