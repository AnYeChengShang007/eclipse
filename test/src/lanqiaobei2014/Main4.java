package lanqiaobei2014;

public class Main4 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			if (i%2==0) // МоїХ
				System.out.println(i * i / 2);
			else
				System.out.println((i * i - 1) / 2);
		}
	}

}
