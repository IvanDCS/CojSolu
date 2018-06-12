import java.util.*;
import java.lang.*;
public class coj2700{
	static  StringBuilder it  = new StringBuilder("First:");
	static  StringBuilder s  = new StringBuilder("Second:");
	static 	StringBuilder f  = new StringBuilder("First&Second:");
	static Map<String, Integer> map;
	static void conjunto1(String a, int v){
		for(int i=0;i<a.length();i++){
			if(map.containsKey(a.charAt(i)+""))
				map.put(a.charAt(i)+"",3);			
			else
				map.put(a.charAt(i)+"",v);
		}
	}
	public static void main (String ... args){
		map = new TreeMap<String, Integer> ();
		Scanner l = new Scanner(System.in);
		String t = l.next(); conjunto1(t,1);
		String p = l.next(); conjunto1(p,2);
		Iterator ite = map.keySet().iterator();
		String key;
		while(ite.hasNext()){
			 key = ite.next().toString();
			if(map.get(key)==1){
				it.append(key); continue;
			} 
			if(map.get(key)==2){
				s.append(key); continue;
			}
			f.append(key);
		}
		System.out.println(it); System.out.println(s); 	System.out.println(f);
	}
}