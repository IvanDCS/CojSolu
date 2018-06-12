import java.util.Scanner;
import java.util.LinkedList;
public class og{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		LinkedList<Integer> to = new <Integer>LinkedList ();
		boolean nt=true;
		int a;
		while(nt){
				a=e.nextInt();
				a+=e.nextInt();
				if(a==0)
					nt=false;
				else	
					to.add(a);
		}
		for(int y=0;y<to.size();y++)
			System.out.println(to.get(y)); 
	}
}