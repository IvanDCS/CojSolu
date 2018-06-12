import java.util.*;
import java.io.*;
public class coj2995{
	static final Scanner l = new Scanner(System.in);
	static  StringBuilder it  = new StringBuilder("");
	static final PrintWriter std = new PrintWriter(System.out);
	static HashSet<String> set;
	static String w[];
	static void corte(String r){
		w = r.split("\\s+");
	}
	static void agregar(String r){
		corte(r);
		set.add(w[2]);
	}
	static String salida(String o){
		if(set.size()==0) return o;
		corte(o);
		for(int i=0;i<w.length;i++){
			if(!set.contains(w[i])) it.append(w[i]+" ");
		}
		return it.toString().trim();
	}
	public static void main (String ... args){
		set = new HashSet<String>();
		String so,a1;
		int c=Integer.parseInt(l.nextLine());
		while(c -- !=0){
			so=l.nextLine();
			a1=l.nextLine();
			while(!a1.equals("what does the fox say?")){
				agregar(a1);
				a1=l.nextLine();
			}
			std.println(salida(so));
			it.setLength(0);
			set.clear();
		}
		std.close();
	}
}