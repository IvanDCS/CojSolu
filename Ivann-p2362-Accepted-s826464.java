import java.util.Scanner;
public class num2362{
	public static void main(String [] args){
		Scanner l = new Scanner(System.in);
		int e,f=0,w,c=l.nextInt();
		while(c-- !=0){
			e=l.nextInt();
			w=e+e-1;
			f=0;
			for(int u=w-2;u>=1;u=u-2)
				f+=u;
			f*=2;
			f+=w;
			System.out.println(f);
		}
	}
}