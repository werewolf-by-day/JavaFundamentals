public class FizzBuzz {
	public String fizzBuzz(int number) {
		if (number%15 == 0) {
			String Fizzy = ("FizzBuzz");
			return Fizzy;
		}
		else if (number%3 == 0) {
			String Fizzy = ("Fizz");
			return Fizzy;
		}
		else if (number%5 == 0) {
			String Fizzy = ("Buzz");
			return Fizzy;
		}
		else {
			String Fizzy = String.format("%d", number);
			return Fizzy;
		}
	}
}