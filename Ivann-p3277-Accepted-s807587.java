import java.util.Scanner;
import java.util.ArrayList;
public class semil{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		ArrayList <Integer> bd = new <Integer> ArrayList();
		ArrayList <Integer> d = new <Integer> ArrayList();
		int a=l.nextInt();
		for(int y=0;y<a;y++)
			bd.add(l.nextInt());
		
		for(int b=0;b<a-1;b++){
			int di=Math.abs(bd.get(b)-bd.get(b+1));
			if(d.contains(di)){
				System.out.println("YES");
				break;
			}else
				d.add(di);
		}
		
	}
}