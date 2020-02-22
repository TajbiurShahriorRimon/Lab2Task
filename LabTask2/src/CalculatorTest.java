
public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		int result = c1.add(10, 5);
		System.out.println("Addition result: "+result);
		
		result = c1.sub(10, 5);
		System.out.println("Subtraction result: "+result);
		
		result = c1.mult(10, 5);
		System.out.println("Multiplicition result: "+result);
		
		float result1 = c1.div(10, 5);
		System.out.println("Division result: "+result1);
		
		Tax t = new Tax();
		double salary = 20000;
		double tax_amount = t.taxCalculate(salary);
		System.out.println("Total Tax: " +tax_amount);
	}

}
