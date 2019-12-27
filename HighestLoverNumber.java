package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestLoverNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter a number");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Enter a number");
		int num3 = Integer.parseInt(br.readLine());
		if (num >= num2 && num >= num3) {
			System.out.println(num + " is the highest number.");
		} else if (num2 >= num && num2 >= num3) {
			System.out.println(num2 + " is the highest number.");
		} else {
			System.out.println(num3 + " is the highest number.");
		}
	}
}
