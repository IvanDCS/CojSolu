import java.util.Scanner;
import java.util.Arrays;
public class num2369{
	public static void main(String []arg){
		Scanner l = new Scanner(System.in);
		long a=0,b=0,c=0;
		int p=l.nextInt();
		while(p-- !=0){
			long []  r = new long [6];
			a=l.nextLong();
			b=l.nextLong();
			c=l.nextLong();
			r[0]=(a+b)*c;
			r[1]=(a+c)*b;
			r[2]=(b+c)*a;
			r[3]=(a*b)+c;
			r[4]=(a*c)+b;
			r[5]=(c*b)+a;
			Arrays.sort(r);
			System.out.println(r[0]+" "+r[5]);
		}
	}
}