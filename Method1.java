
public class Method1 {

	public static void main(String[] args) {
		System.out.println("----> main() started <----");
		addNumbers();
		System.out.println("----> main() ended <----");
	}

	public static void addNumbers() {
		System.out.println("----> addNumbers() started <----");	
		int a=4,b=6;
		int sum = a+b;
		System.out.println("The Sum = "+sum);
		System.out.println("----> addNumbers() ended <----");	
	}

}
