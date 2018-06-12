import java.util.*;
public class coj2700{
	static Set<String> set1;
	static Set<String> set2;
	static Set<String> set3;
	static Iterator<String> iterator;
	static void conjunto(String a){
		for(int i=0;i<a.length();i++)
			set1.add(a.charAt(i)+"");
	}
	static void conjunto1(String a){
		for(int i=0;i<a.length();i++){
			if(set1.contains(a.charAt(i)+"")){
				set3.add(a.charAt(i)+"");
				set1.remove(a.charAt(i)+"");
			}else{
				set2.add(a.charAt(i)+"");
			}
		}
	}
	public static void main (String ... args){
		set1 = new TreeSet<String> ();
		set2 = new TreeSet<String> ();
		set3 = new TreeSet<String> ();
		Scanner l = new Scanner(System.in);
		String t = l.next(); conjunto(t);
		String p = l.next(); conjunto1(p);
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