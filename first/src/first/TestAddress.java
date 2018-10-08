package first;
class Address{
	private String name;
	private long call;
	private String email;
	public void setName(String na) {
		name = na;
	}
	public String getName() {
		return name;
	}
	public void setCall(long ca) {
		call = ca;
	}
	public long getCall() {
		return call;
	}
	public void setEmail(String em) {
		email = em;
	}
	public String getEmail() {
		return email;
	}
	
	public Address(String name, long call, String email) {
		this.name = name;
		this.call = call;
		this.email = email;
	}
	public void Show(){
        System.out.println("姓名："+name+",电话："+call+",E-mail地址："+email);
    }
}
public class TestAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("小明", 1008611, "1008671789@qq.com");
		address1.Show();
		Address address2=new Address("小花", 1000011, "1000011456@qq.com");
		address2.Show();
		Address address3=new Address("小陈", 1001012, "1001012789@qq.com");
		address3.Show();
	}

}
