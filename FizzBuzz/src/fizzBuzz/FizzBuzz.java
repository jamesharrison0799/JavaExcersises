package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int maxNum = 100;
		
		for(int i = 1; i <= maxNum; i++) {
			if(i%3==0 && i%5==0 ){
				System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("fizz");
			}else if (i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}

	}

}
