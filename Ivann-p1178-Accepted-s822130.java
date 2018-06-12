import java.util.Scanner;
import java.util.Arrays;
public class num1178{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int  a = l.nextInt();
		while(a-- !=0){
			int b=l.nextInt();
			int [] r= new int[b];
			for(int c=0;c<b;c++)
				r[c]=l.nextInt();
			Arrays.sort(r);
			int s=0,su=0;
			for(int e=b-1;e>=0;e--){
				if(su==3)
					su=0;
				if(su==2){
					s+=r[e];
				}
				su++;
			}
			System.out.println(s);
		}
	}
}