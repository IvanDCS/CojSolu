import java.util.Scanner;
import java.math.BigInteger;
public class cruel{
	public static void main(String [] arg){
		Scanner lo = new Scanner(System.in);
		int res=0;
		BigInteger n= new BigInteger("1");
		BigInteger y= new BigInteger("0");
		BigInteger z= new BigInteger("1");
		
		BigInteger a= new BigInteger("0");
		BigInteger b= new BigInteger("0");
		a=lo.nextBigInteger();
		b=lo.nextBigInteger();
		
		 res=y.compareTo(b);
		while(res!=0){
			n=n.multiply(a);
			y=y.add(z);
			res=y.compareTo(b);
		}
		String sa=n.toString();
		for(int w=0;w<sa.length();w++){
			if((w+1)%70!=0)
				System.out.print(sa.charAt(w));
			else
				System.out.println(sa.charAt(w));
		}
		
	}
}