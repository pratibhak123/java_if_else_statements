package simply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneGuy {
	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a age");
		int age = Integer.parseInt(br.readLine());
		if (age<=5) {
			System.out.println("5 saal ki umer ke baad school ja skte ho");}
		else if (age<=18) {
			System.out.println("18 saal ki umer ke baad vote de skte ho");}
		else if (age<=21) {
			System.out.println("21 ki umer ke baad car drive kr skta hai");}
		else if (age<=24) {
			System.out.println("24 saal ki umer ke baad shaadi kr skte ho");}
		else if (age<=25) {
			System.out.println("25 saal kr baad drink kr skte ho");}
		else if (25<=age) {
			System.out.println("Otherwise, I don't know what will you do");
		}
		}
		
		
	}


