import java.util.Scanner;
public class calc{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		long A=e.nextLong();
		long B=e.nextLong();
		long r=(A+B) + (A-B) + (B+A) + (B-A);
		System.out.println(r);
	}
}