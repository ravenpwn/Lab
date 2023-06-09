package exercise;
import java.util.Scanner;

public class NStar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = keyboard.nextInt();
		keyboard.close();
		
		String star = "*";
		String space = " ";
		for(int i = 0; i<n ;i++) {
			String repeatedStar = new String(new char[2*i+1]).replace("\0", star);
			String repeatedSpace = new String(new char[n-i]).replace("\0", space);
			System.out.print(repeatedSpace + repeatedStar + repeatedSpace +"\n");
		}
		
	}
}
