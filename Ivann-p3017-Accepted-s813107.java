import java.util.Scanner;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class nopola{
	public static void main(String [] arg){
	Scanner l = new Scanner(System.in);
	LinkedList <Integer> a = new <Integer> LinkedList();
	while(l.hasNext()){
		String lol=l.nextLine();
		StringTokenizer tokens = new StringTokenizer(lol);
		
		while(tokens.hasMoreTokens()){
			String er=tokens.nextToken();
				if(er.equals("+")){
					int d=a.get(a.size()-1)+a.get(a.size()-2);
					a.set(a.size()-2,d);
					a.removeLast();
			}else
			if(er.equals("-")){
				int d=a.get(a.size()-2)-a.get(a.size()-1);
				a.set(a.size()-2,d);
				a.removeLast();
			}else
				if(er.equals("*")){
					int d=a.get(a.size()-1)*a.get(a.size()-2);
				a.set(a.size()-2,d);
				a.removeLast();
				}
					else
						a.add(Integer.parseInt(er));
		}
		System.out.println(a.get(0));
		a.clear();
	}
  }
}