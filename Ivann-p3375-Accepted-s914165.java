import java.util.Scanner;
import java.io.PrintWriter;
public class coj3375{
	static final Scanner  br = new Scanner(System.in);
	static final PrintWriter std = new PrintWriter(System.out);
	static String a,s;
	static int h,sum;
	static int  cambioooooooo(){
		sum=0;
		if(a.length()>s.length())
			sum=a.length()-s.length();
		for(h=0; h<s.length();h++)
			if(a.charAt(h)!=s.charAt(h))
				sum++;
		return sum;
	}
	public static void main(String ... args ) 
	{
		int c=Integer.parseInt(br.nextLine());
		while(c--!=0){
			a=br.next();
			s=br.next();
			std.println(cambioooooooo());
		}
		std.close();
	}
}