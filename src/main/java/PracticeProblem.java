import java.util.Scanner;
public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char c;
		c = 'a';
		System.out.println(c);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input  = new Scanner(System.in);
		char c;
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		c = word.charAt(2);
		System.out.println(c);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input  = new Scanner(System.in);
		char c;
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		c = word.charAt(1);
		System.out.println("The second character user entered was: " + c);
		
	} 

	public static void q4() {
		//Write question 4 code here
		Scanner input  = new Scanner(System.in);
		int num;
		System.out.print("Input a number: ");
		num = input.nextInt();
		num = num + 1;
		System.out.println("Your number plus 1 is: " + num);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input  = new Scanner(System.in);
		char a;
		char b;
		System.out.print("Input a letter: ");
		a = input.next().charAt(0);
		System.out.print("Input another letter: ");
		b = input.next().charAt(0);
		int sum = a + b;
		System.out.println(sum);
	}

}
