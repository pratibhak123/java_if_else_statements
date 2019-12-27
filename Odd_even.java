package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd_even {

	public static void main(String[] args)  throws NumberFormatException, IOException{
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			System.out.println("Enter a number");
			int number = Integer.parseInt(br.readLine());
			    
		    if(number%2==0){  
		        System.out.println("even number");  
		    }else{  
		        System.out.println("odd number");  
		    }  
		}  
		
	}
