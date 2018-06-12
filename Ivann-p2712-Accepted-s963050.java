import java.util.*;
import java.io.*;
public class coj2712{
	static final Scanner l = new Scanner(System.in);
	static final PrintWriter std = new PrintWriter(System.out);
	static Map<String, Integer> map;
	static void agregar(String c){
		if(map.containsKey(c)){
			int i=map.get(c)+1;
			map.put(c,i);
		}else{
			map.put(c,1);
		}
		
	}
	static int buscar(String h){
		if(map.containsKey(h)) return map.get(h);
		return 0;
	}
	public static void main (String ... args){
		map = new HashMap<String, Integer> ();
		int c=Integer.parseInt(l.nextLine());
		String aux, ap;
		while(c-- !=0){
			aux=l.next(); ap=l.next();
			agregar(ap);
		}
		int a =l.nextInt();
		while(a-- !=0){
			aux=l.next(); ap=l.next();
			std.println(buscar(ap));
		}
		std.close();
	}
}