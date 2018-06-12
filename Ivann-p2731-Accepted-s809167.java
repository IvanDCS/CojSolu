import java.util.Scanner;
import java.text.DecimalFormat;
public class cuacir{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		DecimalFormat de = new DecimalFormat("0.00");
		int p=l.nextInt();
		for(int c=0;c<p;c++){
			double u=l.nextDouble();
			double ac=u*u;
			double acr=(u/2.0)*(u/2.0)*Math.PI;
			System.out.println(de.format(ac-acr));
		}
	}
}