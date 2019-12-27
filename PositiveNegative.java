package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegative {

	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a number");
		int number = Integer.parseInt(br.readLine());
	    if(number>0){  
	    System.out.println("positive");  
	    }else if(number<0){  
	    System.out.println("negative");   
	   }  
	}

}
