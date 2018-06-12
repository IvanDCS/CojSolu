import java.util.*;
public class alaverga {
	static long suma(String a, String b){
		return Long.valueOf(a)+Long.valueOf(b);
	}
	public static void main (String ... args){
		Scanner l = new Scanner(System.in);
		String a,b;
		a=l.next();
		b=l.next();
		a=a.replace('6','5');
		b=b.replace('6','5');
		System.out.print(suma(a,b)+" "+suma(a.replace('5','6'),b.replace('5','6')));
	}
}