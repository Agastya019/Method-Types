import java.util.Scanner;

public class Method4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number a :");
		double a = scan.nextDouble();
		System.out.println("Enter number b :");
		double b = scan.nextDouble();
		double add = addNumbers(a, b);
		System.out.println("The Sum of a & b is :"+add);
	}

	private static double addNumbers(double a, double b) {
		double sum = a + b;
		return sum;
	}

}
