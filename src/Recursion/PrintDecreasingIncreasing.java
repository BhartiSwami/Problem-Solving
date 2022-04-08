package Recursion;
import java.util.*;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		PrintResult(n);
	}
	public static void PrintResult(int n) {
		if(n<0) {
			if(n==0)
				return;
			System.out.println(n);
			PrintResult(n+1);
			System.out.println(n);
		}
		else {
			if(n==0)
				return;
			System.out.println(n);
			PrintResult(n-1);
			System.out.println(n);
		}
	}

}
