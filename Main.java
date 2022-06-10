import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		int sum1 = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (i % 2 == 0) { // È¦¼ö
				sum1 += arr[i];
				avg = (double) sum1 / 5;
			} else
				sum += arr[i];
		}
		sc.close();

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}