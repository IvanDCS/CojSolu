import java.util.Scanner;
import java.util.Arrays;
public class num2145{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int  a = l.nextInt();
		int [] r= new int[10];
		int c=0;
		while(a-- !=0){
			c++;
			int s=0;
			for(int i=0;i<10;i++)
				r[i]=l.nextInt();
			Arrays.sort(r);
			for(int e=1;e<9;e++)
			s+=r[e];
		System.out.println(c+" "+s);
		}
	}
}