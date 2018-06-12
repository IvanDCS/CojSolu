import java.io.*;
import java.util.*;
public class num3285{ 
	static String aux;
	static String txt;
	static int v;
	static String fun(String a, long x){
		x=x%a.length();
		int b=(int)x;
		v=a.length()-b;
		if(b==0)
			return a;
		txt="";
		for(int u=0;u<b;u++){
			 txt+=a.charAt(v);
			 v++;
		}
		
		return	txt+=a.substring(0,a.length()-b);
	}
	public static void main(String ... arg){
		PrintWriter std = new PrintWriter(System.out);
		Scanner l = new Scanner(System.in);
		long c,b;
		String a;
		c=l.nextInt();
		while(c-- !=0){
			b=l.nextLong();
			a=l.next();
			std.println(fun(a,b));
		}
		std.close();
	}
}