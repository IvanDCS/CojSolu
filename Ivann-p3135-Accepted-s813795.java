import java.util.Scanner;
import java.math.BigInteger;
public class antfa{
	public static void main (String [] arg){
		Scanner l = new Scanner(System.in);
		int n = l.nextInt();
		for(int y=0;y<n;y++){
			int g=l.nextInt();
			BigInteger fact = new BigInteger("1");
			for (int i = 1; i <= g; i++) 
				fact = fact.multiply(new BigInteger(i + ""));
			String d =fact.toString(); 
			for(int h=d.length()-1;h>=0;h--) 
				if(d.charAt(h)!='0'){
					System.out.println(d.charAt(h));
					break;
				}
		}
	}
}