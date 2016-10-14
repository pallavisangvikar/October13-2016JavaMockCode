package test.coding.java.oct13;

public class PairsInArray {
	
	//How to find all pairs in array of integers whose sum is equal to given number?
	
	public static void printPairs(int[] arr, int sum){
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) { 
			int first = arr[i]; 
			for (int j = i + 1; j < arr.length; j++) { 
				int second = arr[j]; 
				if ((first + second) == sum) { 
					System.out.print("{"+first+","+ second+"}"); 
					} 
				} 
			}
		System.out.print("}");

	}

	public static void main(String[] args) {
		//int[] input = {5,6,7,4,9};
		//int sum = 13;
		int[] input = {2,4,3,5,6,-2,4,7,8,9};
		int sum = 7;

		printPairs(input, sum);
		

	}

}
