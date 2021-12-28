
public class CozaLozaWoza {
	public static void main(String[] args) {

		int Coza = 0;
		int Loza = 0;
		int Woza = 0;
		int num = 0;
		for (int i = 1; i <= 36; i++) {
			if (i % 3 == 0)
				Coza = i;
		}

		for (int i = 1; i <= 36; i++) {
			if (i % 5 == 0)
				Loza =  i;
		}

		for (int i = 1; i <= 36; i++) {
			if (i % 7 == 0)
				Woza = i;
		}
		for (int i = 1; i <= 36; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				num =  i;

			System.out.println("Losa" + Loza + "cosa" + Coza + "Woza" + Woza+"num"+num);
		}
	}
}
