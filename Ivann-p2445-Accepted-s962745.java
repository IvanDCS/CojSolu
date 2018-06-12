import java.util.*;
import java.io.*;
public class coj2445{
	static final Scanner l = new Scanner(System.in);
	static final PrintWriter std = new PrintWriter(System.out);
	static String imp;
	static int inp;
	static void checar(String h, int d){
		if(imp.equals("")){
			imp=h; inp=d;
		}else{
			if(d>inp){
				imp=h; inp=d;
			}
			if(d==inp){
				if(!mayor(imp.charAt(0),h.charAt(0))){
					imp=h; inp=d;
				}
			}
			
		}
		
	}
	static String finale (String h){
		if(h.length()==1) return h;
		int a1,a2;
		String b =""+h.charAt(0);
		a1=minus(h.charAt(0));
		int con=0;
		for(int i=1;i<h.length();i++){
			a2=minus(h.charAt(i));
			if(a2>a1){
				checar(b,con);
				b =""+h.charAt(i);
				a1=a2;
				con=0;
				continue;
			}
			if(a2==a1){
				if(mayor(b.charAt(0),h.charAt(i))){
					con++;
				}else{
					checar(b,con);
					b =""+h.charAt(i);
					a1=a2;
					con=0;
					continue;
				}
			}else{
				con++;
			}
		}
		checar(b,con);
		//std.println(b+" "+con);
		return imp;
	}
	static boolean mayor(char a, char b){
		if((int)a>(int)b) return true;
		else return false;
	}
	static int minus(char s){
		if((int)s>64 && (int)s<91)
			return 1;
		else 
			return 0;
	}
	public static void main (String ... args){
		imp="";
		inp=0;
		String a = l.nextLine();
		std.println(finale(a));
		std.close();
	}
}