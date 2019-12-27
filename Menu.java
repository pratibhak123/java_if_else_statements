package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a Day");
		String day = br.readLine();
		if (day.equals("monday")) {
			System.out.println("menu is Rajma Chawal");}
		else if (day.equals("tuesday")) {
			System.out.println("menu is Pao Bhaji");}
		else if (day.equals("wednesday")) {
			System.out.println("menu is Chole Bhature");}
		else if (day.equals("thursday")) {
			System.out.println("menu is Dosa");}
		else if (day.equals("friday")) {
			System.out.println("menu is Litti Chokha");}
		else if (day.equals("saturday")) {
			System.out.println("menu is Daal Bati");}
		else if (day.equals("sunday")) {
			System.out.println("menu is Poha");} 
		
			
		}

}
