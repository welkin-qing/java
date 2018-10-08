import java.util.Scanner;

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

public class rectange{
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