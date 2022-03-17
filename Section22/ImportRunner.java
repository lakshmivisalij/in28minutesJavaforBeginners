package Section22;
//import java.lang.* -  default import
//import the specific class - not "*" best way to import
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.*;
import static java.lang.System.out;
public class ImportRunner {

	public static void main(String[] args) {
		
		String str = "";
		
		BigDecimal db = null;
		
		out.print("Static Import");
		
		Collections.sort(new ArrayList<String>());
		//static mathod import of mthd sort
		sort(new ArrayList<String>());

	}

}
