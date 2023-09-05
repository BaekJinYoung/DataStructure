import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		int number = 123;
		Scanner kb = new Scanner(System.in); // kb라는 스캐너를 만든다.
		
		System.out.print("please enter an integer: ");
		
		int input = kb.nextInt();
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		kb.close();
	}
}