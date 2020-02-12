package lanqiaobei2013;

import java.util.Calendar;

public class Main1 {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		for(int i=2099;;i+=100) {
			c.set(Calendar.YEAR, i);
			c.set(Calendar.MONTH, 11);
			c.set(Calendar.DAY_OF_MONTH, 31);
			int j = c.get(Calendar.DAY_OF_WEEK);
			if(j==1) {
				System.out.println(i);
				break;
			}
		}
	}
	
}
