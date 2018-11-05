/*设计一个矩形类Rectangle
import java.util.Scanner;
//你的代码将被嵌入到这里 
class Rectangle
{
	double width,height;
	double getArea(){
		return width*height;
	}
	double getPerimeter(){
		return (width+height)*2;
	}
	Rectangle(double a,double b){
		width = a;
		height = b;
	}
}


public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double w = input.nextDouble();
    double h = input.nextDouble();
    Rectangle myRectangle = new Rectangle(w, h);
    System.out.println(myRectangle.getArea());
    System.out.println(myRectangle.getPerimeter());

    input.close();
  }
}

*/
/*计算正五边形的面积和周长 
import java.util.Scanner;
import java.text.DecimalFormat;  

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println(String.format("%.4f", a*a*Math.sqrt(25+10*Math.sqrt(5))/4));
		DecimalFormat df1 = new DecimalFormat("#.####");
		System.out.println(df1.format(a*5));
	}
}
*/
/*定义一个股票类Stock 
import java.util.Scanner;
//你提交的代码将被嵌入到这里 
import java.util.Scanner;
class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
  double currentPrice;
   public Stock(String s1,String s2)
   {
   	symbol=s1;
   	name=s2;
   }
  public double  changePercent()
   {
   return((currentPrice-previousClosingPrice)/previousClosingPrice);
   }
}

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String symbol1=input.next();
    String name1=input.next();    
    Stock stock = new Stock(symbol1, name1);

    stock.previousClosingPrice = input.nextDouble();

    // Input current price
    stock.currentPrice = input.nextDouble();

    // Display stock info
    System.out.println(stock.name+"price changed: " + stock.changePercent() * 100 + "%");
    input.close();
  }
}
*/
/* 摘苹果
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int y = 0;
		int n = in.nextInt();
		int []num = new int[n];
		for(int i=0;i<num.length;i++) {
				int z = in.nextInt();
				num[i] = z;
		}
		
		int s = in.nextInt();
		for(int i=0;i<num.length;i++) {
			if(num[i] <= s+30) {
				y++;
			}
		}
		System.out.println(y);
		}


}
*/
/*数组从小到大排序
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int [n];
		for(int i=0; i<n; i++) {
			int z = sc.nextInt();
			num[i] = z;
		}
		java.util.Arrays.sort(num);
		for(int i=0; i<num.length; i++) {
			System.out.printf(num[i]+ " ");
		}
	}

}
*/
/*人名地名排序
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String []num = new String[n];
		for(int i=0; i<n; i++) {
			String z = in.next();
			num[i] = z;
		}

		java.util.Arrays.sort(num);
		for(int i=0;i<n;i++) {
			System.out.println(num[i]);
		}

	}

}
*/
/*选择法排序 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []num = new int [n];
		for(int i=0;i<num.length;i++) {
			int z = in.nextInt();
			num[i] = z;
		}
		
		int t;
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				if(num[i]<num[j]) {
					t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		//java.util.Arrays.sort(num);
		for(int i=0;i<num.length-1;i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.print(num[num.length-1]);
	}

}

*/
/*查找整数 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int []num = new int [n];
		for(int i=0;i<num.length;i++) {
			int z = in.nextInt();
			num[i] = z;
		}
		int i=0;
		for(i=0; i<num.length;i++) {
			if(x==num[i]) {
				System.out.println(i);return;
			}
		}
		if(i==num.length) {
			System.out.println("Not Found");
		}
	}

}
*/
/*从抽象类shape类扩展出一个圆形类Circle 
import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {// 抽象类
     /* 抽象方法 求面积 */
    public abstract double getArea( );

    /* 抽象方法 求周长 */
    public abstract double getPerimeter( );
}

/* 你提交的代码将被嵌入到这里 */
class Circle extends shape {
	Circle(double r) {
		radius = r ;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	private double radius;
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
         double r = input.nextDouble( ); 
        shape c = new  Circle(r);

        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
    } 
}
*/
/*jmu-Java-03面向对象基础-05-覆盖 
import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;

class PersonOverride {

	private String name;
	private int age;
	private boolean gender;

	public PersonOverride() {
		this("default", 1, true);
	}

	public PersonOverride(String name_arg, int age_arg, boolean gender_arg) {
		name = name_arg;
		age = age_arg;
		gender = gender_arg;
	}

	public String toString() {
		return name + "-" + age + "-" + gender;
	}
	@Override
	public boolean equals(Object o) {
		PersonOverride rfs = (PersonOverride) o;
		if ((this.age == rfs.age) && (this.name.equals(rfs.name) ) && (this.gender == rfs.gender))
			return true;
		else
			return false;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		ArrayList<PersonOverride> person1 = new ArrayList<PersonOverride>();

		for (int i = 0; i < n1; i++) {
			person1.add(new PersonOverride());
		}
		int n2 = input.nextInt();

		ArrayList<PersonOverride> person2 = new ArrayList<PersonOverride>();

		for (int i = 0; i < n2; i++) {
			String t_name = input.next();
			int t_age = input.nextInt();

			String tt = input.next();
			boolean t_gender = Boolean.valueOf(tt);
			
			PersonOverride tmp = new PersonOverride(t_name, t_age, t_gender);
			
			if (!person2.contains(tmp)) {
				person2.add(tmp);
			}
		}

		for (PersonOverride number : person1) {
			System.out.println(number.toString());
		}

		for (PersonOverride number : person2) {
			System.out.println(number.toString());
		}

		System.out.println(person2.size());

		System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
		input.close();
	}
}
*/
/*jmu-Java-03面向对象-06-继承覆盖综合练习-Person、Student、Employee、Company
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        while (true) {
            String s = sc.next();
            if (s.equals("s")) {
                Student student = new Student(sc.next(), sc.nextInt(), sc.nextBoolean(), sc.next(), sc.next());
                sc.nextLine();
                personList.add(student);
            } else if (s.equals("e")) {
                Employee employee = new Employee(sc.next(), sc.nextInt(), sc.nextBoolean(), sc.nextDouble(), new Company(sc.next()));
                sc.nextLine();
                personList.add(employee);
            } else {
                break;
            }
        }
        sc.nextLine();
        personList.sort((o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return o1.getAge() - o2.getAge();
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        if (sc.next().equals("exit")) {
            for (int i = 0; i < personList.size(); i++) {
                System.out.println(personList.get(i));
            }
            return;
        }
        List<Student> studentList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) instanceof Student) {
                if (!studentList.contains(personList.get(i))) {
                    studentList.add((Student) personList.get(i));
                }
            }
            if (personList.get(i) instanceof Employee) {
                if (!employeeList.contains(personList.get(i))) {
                    employeeList.add((Employee) personList.get(i));
                }
            }
        }

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        System.out.println("stuList");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("empList");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
class Person {
    private String name;
    private int age;
    private boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (person.name.equals(this.name) &&
                    person.age == this.age &&
                    person.gender == this.gender) {
                return true;
            }
        }
        return false;
    }
}

class Student extends Person {

    private String stuNo;
    private String clazz;


    public Student(String name, int age, boolean gender, String stuNo, String clazz) {
        super(name, age, gender);
        this.stuNo = stuNo;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student:" + super.toString() + "-" + stuNo + "-" + clazz;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (super.equals(obj)) {
            Student student = (Student) obj;
            if (student.stuNo.equals(this.stuNo) &&
                    student.clazz.equals(this.clazz)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Company) {
            Company company = (Company) obj;
            if (company.name.equals(this.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

class Employee extends Person {
    private Company company;
    private double salary;


    public Employee(String name, int age, boolean gender, double salary, Company company) {
        super(name, age, gender);
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" + super.toString() + "-" + company.toString() + "-" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (super.equals(obj)) {
            Employee employee = (Employee) obj;
            if (employee.company.equals(this.company)) {
                DecimalFormat df = new DecimalFormat("#.#");
                double salary1 = Double.valueOf(df.format(salary));
                double salary2 = Double.valueOf(df.format(employee.salary));
                if (salary1 == salary2) {
                    return true;
                }
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
}

*/
/*求正n边形的面积和周长 
interface IShape {// 接口

double getArea(); // 求面积

double getPerimeter();// 求周长

}
/* 这里有正n边形类RegularPolygon的实现*/

public class Main {
    public static void main(String[] args) {

        /* 你提交的代码将嵌入到这里 */ 
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double a = sc.nextDouble();

        RegularPolygon regularPolygon = new RegularPolygon(n,a);

        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println(df.format(regularPolygon.getArea()));

        double c = regularPolygon.getPerimeter();

        if(c == (int)c){

            df = new DecimalFormat("#");

        }

        System.out.println(df.format(c));
    }
}
*/
/*找出最大的对象 
import java.util.*;
import java.lang.*;

public class Main {
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
*/
/*成绩录入时的及格与不及格人数统计
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []score = new int [n];
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num<=100 && num>0) {
				score[i] = num;
			}else {
				System.out.println(num+"invalid!");
			}
		}
		int a=0,b=0;
		for(int i=0; i<score.length;i++) {
			if(score[i]>=60) {
				a=a+1;
			}else {
				b=b+1;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

}
*/
/*jmu-Java-06异常-多种类型异常的捕获
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
        String choice = sc.next();
        try {
            if (choice.equals("number"))
                throw new NumberFormatException();
            else if (choice.equals("illegal")) {
                throw new IllegalArgumentException();
            } else if (choice.equals("except")) {
                throw new Exception();
            } else
            break;
        }
        /*这里放置你的答案*/
       catch(NumberFormatException e) {
	        	System.out.println("number format exception");
	        	System.out.println(e);
	        }
	       
	        catch(IllegalArgumentException e){
	        	System.out.println("illegal argument exception");

	            System.out.println(e);
	        }
	        catch (Exception e){
	        	System.out.println("other exception");
	            System.out.println(e);
	        }
	        
	        finally{
	         
	        }

    }//end while
    sc.close();
}
*/
/*数字格式异常
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int a,b;
        while(true)
        {
            try{
                a=in.nextInt();b=in.nextInt();
                System.out.println("Sum is "+(a+b));
            }
            catch(InputMismatchException e)
            {
                in.nextLine();
                System.out.println("Incorrect input and re-enter two integers:");
                continue;
            }
            break;
        }
    }
 }
*/