import java.util.*;
public class Circle {
	int radius;
	Circle(){
		radius=5;
	}
	Circle(int radius ){
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		Circle circle = new Circle(radius);
	}

}
