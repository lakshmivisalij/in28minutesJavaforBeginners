package Section11;

public class WhileNumberPlayer {
	
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}
	public void printSquaresUptoLimit() {
		int i = 1;
		while(i*i<limit) {
			System.out.print(i*i + " ");
			i++;	
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while(i*i*i<limit) {
			System.out.print(i*i*i + " ");
			i++;	
		}
		System.out.println();
	}	
		
		
	}

	

