import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner square = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double length = square.nextDouble();
		double area = length * length;
		System.out.println("Area of square: " +area);
	}

}
