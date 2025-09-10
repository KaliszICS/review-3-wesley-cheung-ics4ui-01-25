import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q7();
	}

	public static void q1() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		System.out.println((input.nextLine()).charAt(0));
		input.close();
		
	}

	public static void q2() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		System.out.println(!(input.nextBoolean()));
		input.nextLine();
		input.close();
		
	}

	public static void q3() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		System.out.println((input.nextInt()>5));
		input.nextLine();
		input.close();
	}

	public static void q4() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		input.nextLine();
		System.out.println((number1 <=2 && number1 >=-2));
		input.close();
		
	}

	public static void q5() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		System.out.println((input.nextLine()).equals("Hello World"));
		input.close();
		
	}

	public static void q6() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		int number2 = input.nextInt();
		input.nextLine();
		System.out.println(number1<=number2);
		input.close();
		
	}

	public static void q7() {
		System.out.print("In: ");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		input.nextLine();
		System.out.print("In: ");
		double number2 = input.nextDouble();
		input.nextLine();
		System.out.println(number1>number2);
		input.close();
		
	}

}
