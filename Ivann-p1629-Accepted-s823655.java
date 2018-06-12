import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class num1629{
    public static void main(String args[]){
        Scanner  l = new Scanner(System.in);
		ArrayList lista = new ArrayList();
		String a,b;
		while(l.hasNext()){
			a=l.next();
			b=l.next();
			for(int u=0;u<a.length();u++){
				if(b.indexOf(a.charAt(u))!=-1){
					b=b.replaceFirst(""+a.charAt(u),"");
					lista.add(a.charAt(u));
				}
			}
			Collections.sort(lista);
			for(int u=0;u<lista.size();u++)
				System.out.print(lista.get(u));
			System.out.println("");
			lista.clear();
		}
	}
}