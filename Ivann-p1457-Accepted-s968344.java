import java.util.Scanner;
import java.math.BigInteger;


public class coj1457{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		BigInteger a = new BigInteger(in.next());
		BigInteger b = new BigInteger(in.next());
		BigInteger i = new BigInteger("1");
		BigInteger i2 = new BigInteger("2");
		BigInteger i3= new BigInteger("0");
		
		if(((a.mod(i2)).compareTo(i3))==0)	a=(b.multiply(a.divide(i2))).multiply(a.subtract(i));
		else	{
				i3=a.divide(i2);
				i3=b.multiply(i3);
				i3=i3.add(b);
				b=a.subtract(i);
				a=i3.multiply(b);
		}
		System.out.println(a);
	}
}