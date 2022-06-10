import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int even = 0;
		int odd = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (i % 2 == 0) { // odd
				odd += arr[i];
				avg = (double) odd / 5;
			} else
				even += arr[i];
		}
		sc.close();

		System.out.println("sum : " + even);
		System.out.println("avg : " + avg);

	}

}