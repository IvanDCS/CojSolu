import java.util.*;
import java.lang.*;
public class coj2700{
	static  StringBuilder it  = new StringBuilder("First:");
	static  StringBuilder s  = new StringBuilder("Second:");
	static 	StringBuilder f  = new StringBuilder("First&Second:");

	public static void main (String ... args){
		char [] a ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int [] b = new int [26];
		Scanner l = new Scanner(System.in);
		String t = l.next();
		String p = l.next();
		for(int u=0;u<t.length();u++)
			b[t.charAt(u)-65]=(b[t.charAt(u)-65]!=2)?1:3;
		for(int u=0;u<p.length();u++)	
			b[p.charAt(u)-65]=(b[p.charAt(u)-65]!=1)?2:3;
		for(int u=0;u<26;u++){
			if(b[u]==1)
				it.append(a[u]+"");
			else{
				if(b[u]==2)
					s.append(a[u]+"");
				else
					if(b[u]==3) f.append(a[u]+"");
			}
		}
		System.out.println(it);
		System.out.println(s);
		System.out.println(f);
	}
}