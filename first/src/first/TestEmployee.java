package first;
class myDate{
	private int year;
	private int month;
	private int day;
	public myDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
}
class Employee{
	private String name;
	private double salary;
	private myDate hireDay;
	public Employee(String name, double salary, myDate day) {
		this.name = name;
		this.salary = salary;
		hireDay = day;
	}
	public void show() {
		System.out.println("姓名："+name+",工资："+salary+",受雇日:"+hireYear());
	}
	public String hireYear() {
		return hireDay.getYear()+"."+hireDay.getMonth()+"."+hireDay.getDay();
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee("张三",25000,new myDate(2019,7,15));
		a.show();
		Employee b = new Employee("李四",18000,new myDate(2015,11,30));
		b.show();
		Employee c = new Employee("王五",10000,new myDate(2001,8,23));
		c.show();
	}

}
