import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
public class num1597{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		DecimalFormat fo= new DecimalFormat("0.000000");
		while(true){
			int a=l.nextInt();
			int b=l.nextInt();
			int c=l.nextInt();
			if(a==0 && b==0 && c==0)
				break;
			int [] r= new int [c];
			for(int z=0;z<c;z++)
				r[z]=l.nextInt();
			Arrays.sort(r);
			int su=0,re=c-a,f=c-b-a;
			for(int w=b;w<re;w++)
				su+=r[w];
			System.out.println(fo.format((double)su/f));
		}
	}
}