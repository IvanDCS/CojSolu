import java.util.Scanner;
import java.math.BigInteger;
public class big{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		BigInteger  n;
		int a=l.nextInt();
		n= new BigInteger("0");
		
		for(int y=0;y<a;y++){
			BigInteger A=l.nextBigInteger();
			n=n.add(A);
		}
		System.out.println(n);
	}
}