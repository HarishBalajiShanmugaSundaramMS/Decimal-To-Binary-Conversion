import java.util.Scanner;

public class Dec2Bin {
	public static void convert(int number) {
		if (number > 1) {
			convert(number / 2);
		}
		System.out.print(number % 2);
	}

	public static void main(String[] args) {
		System.out.println("Enter a decimal: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		convert(number);

	}
}
