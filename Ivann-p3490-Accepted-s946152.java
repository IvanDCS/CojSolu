import java.util.*;
import java.io.*;
public class coj3490{
	static final Scanner l = new Scanner(System.in);
	static final PrintWriter std = new PrintWriter(System.out);
	static int a,b,c;
	public static void main (String ... args){
		a=l.nextInt();
		while(a--!=0){
			b=l.nextInt();
			c=l.nextInt();
			std.println(c-(c/b));
		}
		std.close();
	}
}