import java.util.Scanner;
import java.text.DecimalFormat;
public class whwi{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		DecimalFormat r = new DecimalFormat("0.00");
		int a=l.nextInt();
		double su=0;
		for(int y=0;y<a;y++)
			su+=l.nextDouble();
		
		System.out.print(r.format(su/(float)a));
	}
}