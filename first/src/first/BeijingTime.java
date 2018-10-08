package first;
class Clock{
	private int hour;
	private int min;
	private int second;
	
	public void setHour(int h) {
		hour = h;
	}
	public int getHour() {
		return hour;
	}
	public void setMin(int m) {
		min = m;
	}
	public int getMin() {
		return min;
	}
	public void setSecond(int s) {
		second = s;
	}
	public int getSecond() {
		return second;
	}
	public Clock(int hour,int min, int second) {
		this.hour = hour;
		this.min = min;
		this.second = second;
	}
	public void show() {
		System.out.println("当前时间："+hour+"时，"+min+"分，"+second+"秒");
	}
}
public class BeijingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c1 = new Clock(3,05,36);
		c1.show();
		Clock c2 = new Clock(22,55,05);
		c2.show();
		Clock c3 = new Clock(20,03,59);
		c3.show();
	}

}
