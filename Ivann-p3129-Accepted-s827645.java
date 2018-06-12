import java.util.Scanner;
import java.util.ArrayList;
public class num3129{
    public static void main(String args[]){
        Scanner  l = new Scanner(System.in);
		ArrayList<Integer> lis=new ArrayList<Integer>();
		int b,v,a=Integer.parseInt(l.next());
		
		while(a-- !=0){
			v=Integer.parseInt(l.next());
			String c=l.next();
			b=Integer.parseInt(l.next())-1;
			if(c.equals("odd")){
				for(int u=1;u<=v;u++)
					if(u%2==0)
						lis.add(u);
			}
				else{
					for(int u=1;u<=v;u++)
					if(u%2!=0)
						lis.add(u);
				}
			System.out.println(lis.get(b));
			lis.clear();
		}
		
	}
}