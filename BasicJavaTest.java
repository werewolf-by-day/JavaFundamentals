class BasicJavaTest {
	public static void main(String[] args) {
		BasicJava iD = new BasicJava();
		iD.printNum();
		iD.printOdd();
		iD.printSum();
		int[] arrayX = {1,3,5,7,9,13};
		iD.iterateArray(arrayX);
		iD.findMax(arrayX);
		iD.getAverage(arrayX);
		iD.oddNumbers();
		iD.greaterThan(arrayX, 3);
		iD.squaredValues(arrayX);
		int[] anyArray = {1,5,10,-2};
		iD.eliminateNegatives(anyArray);
		iD.maxMinAverage(anyArray);
		int myArray = {1,5,10,7,-2};
		iD.shiftingValues(myArray);
	}
}