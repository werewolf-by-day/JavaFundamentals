class StringManipulatorTest {
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
	String result = manipulator.trimAndConcat("  Hello  ", "  World  ");
	System.out.println(result);

	char letter = 'o';
	Integer a = manipulator.getIndexOrNull("Coding", letter);
	Integer b = manipulator.getIndexOrNull("Hello World", letter);
	Integer c = manipulator.getIndexOrNull("Hi", letter);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

	String word = "Hello";
	String subString = "llo";
	String notSubString = "world";
	Integer d = manipulator.getIndexOrNull(word, subString);
	Integer e = manipulator.getIndexOrNull(word, notSubString);
	System.out.println(d);
	System.out.println(e);

	String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
	System.out.println(word2);
	}
}