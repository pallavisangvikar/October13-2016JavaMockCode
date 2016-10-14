package test.coding.java.oct13;

public class SumOfNumsInString {
	
	//find sum of only numbers in a given string and take subsequent numbers as one number
	
	public static int sumOfNums(String s){
		 int sum = 0;
		 int factor = 1;
		 if(null != s && s.length()>0){
			 for(int i = s.length()-1; i>=0; i--){
				 if(Character.isDigit(s.charAt(i)) ){
		        		sum = sum + (Character.getNumericValue(s.charAt(i)) * factor);
		        		factor = factor * 10;
		        	}else
		        		factor = 1;
		        } 
		 }	else{
			    System.out.println("String is empty or null-please provide valid string");
		    }

		return sum;
	}

	public static void main(String[] args) {
		String input = "hello7hi89ko";
		//String input = "he7kkj8p5o";
		//String input = "he123l3lo4";
		int sum = sumOfNums(input);
		
		System.out.println("Sum = "+sum);
	}

}
