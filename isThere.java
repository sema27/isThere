package mini5;

public class Main {

	public static void main(String[] args) {
		int numbers[] = new int[] { 1, 2, 5, 7, 9, 0 };
		int lookfor = 5;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == lookfor) {
				isThere = true;
				break;
			}

		}

		if (isThere == true) {
			System.out.println("This number was found.");
		}
		if (isThere == false) {
			System.out.println("This number wasn't found.");
		}
	}
}
