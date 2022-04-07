package Recursion;
import java.util.*;

public class Factorial_ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int fact = findFactorial(num);
		System.out.println(fact);

	}
	public static int findFactorial(int num) {
		if(num == 1)
			return 1;
		return num*findFactorial(num-1);
	}

}
