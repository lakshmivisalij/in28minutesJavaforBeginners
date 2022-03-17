package Section22;

public class NestedClassRunner {

	
	class InnerClass{
		
	}
	
	static class StaticNestedClass {
		
	}
	
	public static void main(String[] args) {
		//InnerClass inc = new InnerClass();

		StaticNestedClass snc = new StaticNestedClass();
		NestedClassRunner ncr = new NestedClassRunner();
		InnerClass inc = ncr.new InnerClass();
		
	}

}
