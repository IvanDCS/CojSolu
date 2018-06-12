import java.util.ArrayList;
import java.util.Scanner;
public class num1855{
    public static void main(String args[]){
        Scanner  l = new Scanner(System.in);
		ArrayList<Integer> en =new <Integer>ArrayList();
		ArrayList<Integer> sa =new <Integer>ArrayList();
		int tn,n,c=l.nextInt();
		while(c-- !=0){
			tn=l.nextInt();
			while(tn-- !=0){
				n=l.nextInt();
				if(en.contains(n))
					sa.add(n);
				else
					en.add(n);
			}
			if(sa.size()==0)
				System.out.println("Not found!");
			for(int u=0;u<sa.size();u++)
				System.out.println(sa.get(u));
			sa.clear();
			en.clear();
		}
	}
}