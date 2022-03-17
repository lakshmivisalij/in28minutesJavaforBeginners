package Section11;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(9);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
		
		int sum1 = number.sumUptoN();
		System.out.println("Sum upto N: " + sum1);
		
		int sumDivisors = number.sumOfDivisors();
		System.out.println("Sum of divisors: "+sumDivisors);
		
		System.out.println("Printing Triangle:");
		number.printNumberTriange();
		
	}

}
