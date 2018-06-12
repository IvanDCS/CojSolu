import java.util.*;
public class conj{
	public static void main(String [] arg){
		Scanner le = new Scanner(System.in);
		HashSet lis = new HashSet();
		int a=le.nextInt();
		for(int y=0;y<a;y++){
		int b=le.nextInt();
			for(int x=0;x<b;x++)
				lis.add(le.nextInt());	
		}
		System.out.println(lis.size());
	}
}