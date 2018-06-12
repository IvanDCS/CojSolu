import java.util.Scanner;
import java.util.HashSet;
public class bleach {
	public static void main(String [] arg){
		Scanner ic= new Scanner(System.in);
		HashSet a = new HashSet();
		int c=ic.nextInt();
		int x=ic.nextInt();
		for(int u=0;u<x;u++)
			a.add(ic.nextInt());
		
		System.out.println(c-a.size());
	}
}