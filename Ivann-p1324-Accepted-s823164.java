import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class num1324{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		ArrayList<Integer> lista=new <Integer>ArrayList();
		int s=0;
		for(int u=0;u<9;u++){
			lista.add(l.nextInt());
			s+=lista.get(u);
		}
		Collections.sort(lista);
		s-=100;
		for(int u=8;s>0;u--){
			for(int w=7;w>=0;w--)
				if((lista.get(u)+lista.get(w))==s){
					lista.remove(u);
					lista.remove(w);
					s=0;
					break;
				}
		}
		for(int u=0;u<lista.size();u++)
			System.out.println(lista.get(u));
	}
}