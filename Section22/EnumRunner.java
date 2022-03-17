package Section22;

import java.util.Arrays;

enum Season{
	WINTER(4), SPRING(2), SUMMER(3), FALL(1);
    
	private int value;
	Season(int value) {
		this.value = value;
	}
	//0,1,2,3 - ordinals
	
	public int getValue() {
		return value;
	}
}
public class EnumRunner {
	
	//Season season;

	public static void main(String[] args) {
		
    Season season = Season.FALL;
    
    Season season1 = Season.valueOf("WINTER");
    System.out.println(season1);
    System.out.println(season1.ordinal());
    System.out.println(Arrays.toString(season.values()));
    System.out.println(season.SPRING.getValue());
	}

}
