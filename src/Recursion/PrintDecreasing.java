package Recursion;
import java.util.*;

public class PrintDecreasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrintDecreasing pd = new PrintDecreasing();
		pd.PrintResult(n);

	}
	public void PrintResult(int n) {
		if(n<0) {
			if(n==0)
				return;
			PrintResult(n+1);
			System.out.println(n);
		}
		else {
		if(n==0)
			return;
		System.out.println(n);
		PrintResult(n-1);
		}
	}

}
