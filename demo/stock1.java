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

public class stock1 {
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
