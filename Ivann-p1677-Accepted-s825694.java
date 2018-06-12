import java.util.Scanner;
import java.util.Arrays;
public class num1677{
	public static void main(String [] arg){
		Scanner l= new Scanner(System.in);
		int t,a,s,o=Integer.parseInt(l.next());
		int [] ar;
		String k;
		while(o-- !=0){
			s=0;
			t=Integer.parseInt(l.next());
			a=Integer.parseInt(l.next());
			k=l.next();
			ar=new int[t];
			for(int u=0;u<t;u++)
				ar[u]=Integer.parseInt(l.next());
			Arrays.sort(ar);
			if(k.equals("regular"))
				for(int u=t-a;u<t;u++)
					s+=ar[u];
			else
				for(int u=0;u<a;u++)
					s+=ar[u];
			System.out.println(s);
		}
	}
}