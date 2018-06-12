import java.util.*;
public class coj2124{
	public static void main(String ... args){
		Scanner l = new Scanner(System.in);
		int a;
		while(l.hasNext()){
			a=l.nextInt();
			if(a%6==0) System.out.println("Y");
			else	System.out.println("N");
		}
	}
}