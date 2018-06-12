import java.util.Scanner;
import java.math.BigDecimal;
public class num1407{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		for(int r=0;r<10;r++){
			BigDecimal t=l.nextBigDecimal();
			BigDecimal k=l.nextBigDecimal();
			BigDecimal x=(t.subtract(k)).divide(new BigDecimal("2"));
			System.out.println(x.add(k));
			System.out.println(x);
		}
		
	}
}