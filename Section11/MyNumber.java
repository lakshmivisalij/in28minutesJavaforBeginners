package Section11;


public class MyNumber {

	private int number;
	
	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		//Guard Check
		if(this.number<=1) {
			return false;
		}
		if(this.number == 2){
			return true;
		}
		for(int i=2; i<=Math.sqrt(this.number);i++) {
			if(this.number%i==0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		
		int sum1 = 0;
		for(int i=1; i<=this.number;i++) {
			sum1 += i;
		}
		return sum1;
	}

	public int sumOfDivisors() {
		int sum1 = 0;
		for(int i=2;i<=this.number-1;i++) {
			if(this.number%i==0) {
				sum1+=i;
			}
		}
		return sum1;
	}

	public void printNumberTriange() {
		for(int i=1; i<=this.number;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
			System.out.println();
		}
		
	}
	
	

}
