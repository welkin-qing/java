package fourth;

public class Person{
	public String name;
	public String PhoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Person(String name, String PhoneNumber) {

		this.name = name;
		this.PhoneNumber = PhoneNumber;
	}
	public String toString() {
		return "����Ϊ:" + name + "�绰Ϊ:" + PhoneNumber;
	}
}
public class Student extends Person {
    public String  Grade;
    public final static String  freshman ="��һ";
    public final static String  sophomoreman="���";
    public final static String junior="����";
    public final static String senior="����";
    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public Student(String name,String PhoneNumber,String Grade){
        super(name,PhoneNumber);
        this.Grade=Grade;
    }

    public void displayObject(){
        System.out.println("to"+name+":�밴ʱ��ʵ�鱨��");

    }
    public String toString(){
        return super.toString()+"�꼶Ϊ��"+Grade;
    }
}
public class Employee extends Person {

    private double Salary; 
    Mydate mydate;
    public int year;
    public int month;
    public int day;
    public void MyDate(int year,int month,int day){
           this.year=year;
           this.month=month;
           this.day=day;
    }
    public Employee(String Name,String PhoneNumber,double Salary,Mydate date){  

         super(Name,PhoneNumber);   
         this.Salary=Salary;
         mydate=date;
   }

   public double getSalary() {
       return Salary;
   }
   public void setSalary(double salary) {
       Salary = salary;
   }

   public void displayObject(){
       System.out.println("to"+name+":�밴ʱ�ϰ�");

   }

    public Mydate getMydate() {
       return mydate;
   }

   public void setMydate(Mydate mydate) {
       this.mydate = mydate;
   }

   public String toString() {  

        return super.toString()+"����:"+Salary+" "+mydate.year+" "+mydate.month+" "+mydate.getDay();   

    }   

}
public class Mydate  {
    public int year;
    public int month;
    public int day;
    public Mydate(int year, int month, int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }

        public Mydate(String next) {
		// TODO Auto-generated constructor stub
	}

		public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

        public int getYear(){
        return year;
        }
        public int getMonth(){
            return month;
        }
        public int getDay(){
            return day;
            }

}
public class fourth2_4 {
	public final static String  freshman ="��һ";
	public final static String  sophomoreman="���";
	public final static String junior="����";
	public final static String senior="����";

	//�������ַ������Ŀ��
	public static void m1(Person P){
	    System.out.println("name of person:"+P.getName());
	}
	public static void m2(Person P){
	    System.out.println(P.toString());
	}

	public static void m3(Person p){
	    if (p instanceof Student){
	        ((Student)p).displayObject();
	    }else if(p instanceof Employee){
	        ((Employee)p).displayObject();
	    }else{
	       System.out.println(p.getName()+":û�б�����Ϊѧ�����߹�Ա��");
	    }
	}//���p��Student�����Employee���ʵ�����ֱ�������ǵ�displayObject()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Student("morethansea","18373163669",freshman);
	    Person p2 = new Employee("Steven","18354643537",2000,new Mydate(2012,12,2));
	    Person p3 = new Person("Curry","14434643537");
	    m2(p1);
	    m2(p2);
	    m2(p3);
	    m1(p1);
	    m1(p2);
	    m1(p3);
	    m3(p1);
	    m3(p2);
	    m3(p3);
	}

}
