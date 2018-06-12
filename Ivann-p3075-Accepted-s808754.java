import java.util.Scanner;
import java.text.DecimalFormat;
public class taxi{
	public static void main(String [] arg){
		Scanner lo = new Scanner(System.in);
		 DecimalFormat de = new DecimalFormat("0.000000"); 
		int l=lo.nextInt();
		double taxi=l*l*2;
		double eu=Math.PI*l*l;
		System.out.println(de.format(eu)); 
		 System.out.println(de.format(taxi)); 
	}
}