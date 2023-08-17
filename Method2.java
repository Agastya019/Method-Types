import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		System.out.println("----> main() started <----");
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter value of a =");
		int a = scan.nextInt();
		System.out.println("Enter value of b =");
		int b = scan.nextInt();
		addNumbers(a, b);
		System.out.println("----> main() ended <----");
	}

	public static void addNumbers(int a, int b) {
		System.out.println("----> addNumbers() started <----");	
		int sum = a+b;
		System.out.println("The Sum = "+sum);
		System.out.println("----> addNumbers() ended <----");	
	}

}
