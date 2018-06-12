import java.util.Scanner;
import java.math.BigInteger;
public class pandi{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int p = l.nextInt();
		for(int u=0;u<p;u++){
			BigInteger myInt =l.nextBigInteger();
			String m = myInt.toString(2);
			
			if(m.indexOf("0")!=-1 && m.indexOf("1")!=-1)
			System.out.println("YES");
			else
			System.out.println("NO");
		
		}
	}
}