package Section16;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		
		list.addElement("Ele 1");
		list.addElement("Ele 2");
		
		System.out.println(list);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		
		list2.addElement(Integer.valueOf(2));
		list2.addElement(Integer.valueOf(5));
		
		System.out.println(list2);
		

	}

}
