import java.util.Scanner;
import java.text.DecimalFormat;
public class num2115{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		DecimalFormat fo = new DecimalFormat("0.00");
		while(l.hasNext()){
			int a=l.nextInt();
			int b=l.nextInt();
			float su=(float)a/b;
			System.out.println(fo.format(su));
		}
	}
}