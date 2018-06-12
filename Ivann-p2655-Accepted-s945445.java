import java.util.*;
public class coj2655{
	static List lis;
	static final Scanner l = new Scanner(System.in);
	public static void main (String ... arg){
		lis = new ArrayList<Integer>();
		String [] e= new String [5];
		for(int i = 0;i<5;i++){
			e[i]=l.next();
			if(e[i].indexOf("FBI")!=-1)
				lis.add(i+1);
		}
		if(lis.size()==0)
			System.out.println("HE GOT AWAY!");
		else
			for(int u=0;u<lis.size();u++)
				System.out.print((u+1==lis.size())?lis.get(u):lis.get(u)+" ");
	}
}