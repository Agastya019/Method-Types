
public class Method3 {

	public static void main(String[] args) {
		System.out.println("----> main() started <----");
		int addition =addNumbers();
		System.out.println("The Sum ="+addition);
		System.out.println("----> main() ended <----");
	}

	public static int addNumbers() {
		System.out.println("----> addNumbers() started <----");	
		int a=15,b=20;
		int sum = a+b;
		System.out.println("----> addNumbers() ended <----");	
		return sum;
		

		
	}

}
