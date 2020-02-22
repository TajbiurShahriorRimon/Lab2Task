import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Enter the height");
		float height = rectangle.nextFloat();
		
		System.out.println("Enter the width");
		float width = rectangle.nextFloat();
		
		float area = width * height;
		System.out.println("Area of rectangle: " +area);
	}

}
