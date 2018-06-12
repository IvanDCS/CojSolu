import java.util.*;
public class coj2700{
	static Set<String> set1;
	static Set<String> set2;
	static Set<String> set3;
	static Iterator<String> iterator;
	static void conjunto(String a, int c){
		if(c==1){
			for(int i=0;i<a.length();i++)
			set1.add(a.charAt(i)+"");
		}else{
			for(int i=0;i<a.length();i++)
			set2.add(a.charAt(i)+"");
		}
		
	}
	public static void main (String ... args){
		set1 = new TreeSet<String> ();
		set2 = new TreeSet<String> ();
		set3 = new TreeSet<String> ();
		Scanner l = new Scanner(System.in);
		String t = l.next(); conjunto(t,1);
		set3.addAll(set1);
		String p = l.next(); conjunto(p,2);
		set1.removeAll(set2);
		set3.retainAll(set2);
		set2.removeAll(set3);
		System.out.print("First:");
		iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println("");
		System.out.print("Second:"); 
		iterator = set2.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println("");
		System.out.print("First&Second:");
		iterator = set3.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}
}