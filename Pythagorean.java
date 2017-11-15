import java.lang.Math;

public class Pythagorean {
	public double calculateHypotenuse(int legA, int legB) {
		double aSquared = Math.pow(legA, 2);
		double bSquared = Math.pow(legB, 2);
		double aB = aSquared + bSquared;
		double squareRoot = Math.sqrt(aB);
		return squareRoot;
	}
}