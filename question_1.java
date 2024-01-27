import java.util.*;
public class question_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Count from the first number to the second number increments by the third number
		
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 1");
		int n2 = sc.nextInt();
		System.out.println("Enter number 1");
		int n3 = sc.nextInt();
		int sum = 0;
		for(int a=n1;a<=n2;a=a+n3) {
			sum = sum + a;
			System.out.print(a+",");
		}
		System.out.println(sum);

	}

}
