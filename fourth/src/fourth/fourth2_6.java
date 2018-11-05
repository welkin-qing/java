package fourth;
class Account{
	private int id;//账户
	private double balance;//余额
	private double Rate;//利率
	private java.util.Date dateCreated = new java.util.Date();//开户日期
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.Rate = 0;
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public int getId(int id) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRate() {
		return Rate;
	}
	public void setRate(double Rate) {
		this.Rate = Rate;
	}
	public java.util.Date getDateCreate(){
		return this.dateCreated;
	}
	public double getMonthlyInterstRate() {
		return this.Rate/12;
	}
	public double withDraw(double count) {
		this.balance = count;
		return this.balance;
	}
	public double deposit(double count) {
		this.balance += count;
		return this.balance;
	}
}
public class fourth2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1800, 18900);
		account.setRate(0.030);
		account.deposit(4000);
		System.out.println("余额：" + account.getBalance());
		System.out.println("月利息：" + account.getMonthlyInterstRate()*account.getBalance());
		System.out.println("开户日期：" + account.getDateCreate().toString());
	}

}
