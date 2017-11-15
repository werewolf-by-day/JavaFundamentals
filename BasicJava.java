import java.util.ArrayList;

public class BasicJava {

	public void printNum() {
		for(int i = 1; i < 256; i++) {
			System.out.println(i);
		}
	}


	public void printOdd() {
		for(int i = 1; i < 256; i + 2) {
			System.out.println(i);
		}
	}

	public void printSum() {
		int sum = 0;

		for(int i = 0; i < 256; i++) {
			sum += i;
			System.out.println("New number: " + i + "Sum: " + sum);
		}
	}

	public void iterateArray(int[] anyArray) {
		for(int i = 0; i < int anyArray.length; i++) {
			System.out.println("Position " + i + "of your array is " + anyArray[i]);
		}
	}

	public void findMax(int[] anyArray) {
		int max = anyArray[0];

		for(int i = 1; i < int anyArray.length; i++) {
			if (anyArray[i] > max) {
				max = anyArray[i];
			}	
		}
		System.out.println(max);
	}

	public void getAverage(int[] anyArray) {
		double sum = 0;

		for(int i = 0; i < int anyArray.length; i++) {
			sum += anyArray[i];
		}
		System.out.println(sum / anyArray.length);
	}

	public void oddNumbers() {
		ArrayList<Integer> anyArray = new ArrayList<Integer>();

		for(int i = 1; i < 256; i + 2) {
			anyArray.add(i);
		}
		System.out.println(anyArray);
	}

	public void greaterThan(int[], anyArray, int y) {
		int counter = 0;

		for(int i = 0; i < int anyArray.length; i++) {
			if (anyArray[i] > y) {
				counter ++;
			}
		}
		System.out.println(counter);
	}

	public void squaredValues(int[] anyArray) {
		for(int i = 0; i < int anyArray.length; i++) {
			anyArray[i] *= anyArray[i];
		}
		System.out.println(anyArray);
	}

	public void eliminateNegatives(int[] array) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();

		for(int i = 0; i < int array.length; i++) {
			if (array[i] < 0) {
				myArray.add(0);
			} else {
				myArray.add(array[i]);
			}

		}
		System.out.println(myArray);
	}

	public void maxMinAverage(int[] anyArray) {
		int maxnum = 0;
		int minnum = 0;
		int sum = 0;

		for(int i = 0; i < int anyArray.length; i++) {
			sum += i;
			if (anyArray[i] > maxnum) {
				maxnum = anyArray[i];
			}
			if (anyArray[i] < minnum) {
				minnum = anyArray[i];
			}
			sum +=anyArray[i];
		}
		double avg = sum / anyArray.length;
		System.out.println("Max: " + maxnum);
		System.out.println("Min: " + minnum);
		System.out.println("Avg: " + avg);
	}

	public void shiftingValues(int[] anyArray) {
		int length = anyArray.length - 1;

		for(int i = 0; i < int anyArray.length; i++) {
			anyArray[i] = anyArray[i+1];
		}
		anyArray[length] = 0;
		System.out.println(anyArray);
	}

}