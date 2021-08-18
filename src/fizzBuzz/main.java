package fizzBuzz;

public class main {

	public static void main(String[] args) {
		String fizz = "Fizz";
		String buzz = "Buzz";

		for (int i = 1; i < 101; i++) {
			String finalString = "";

			if (i % 3 == 0) {
				finalString = fizz;

			}
			if (i % 5 == 0) {
				finalString += buzz;
			}

			if (i % 3 != 0 && i % 5 != 0) {
				finalString = String.valueOf(i);

			}
			System.out.println(finalString);
		}
	}
}
