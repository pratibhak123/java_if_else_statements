package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisible {
	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a number");
		int number = Integer.parseInt(br.readLine());
		if(number%15==0)
			System.out.println("divisible");
		else 
			System.out.println("divisible not");
		}
		
		
		
	}


