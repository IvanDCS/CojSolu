import java.util.Scanner;
import java.util.ArrayList;
public class base{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		ArrayList a = new ArrayList();
		int c=l.nextInt();
		for(int y=0;y<c;y++){
			int h=l.nextInt();
			int e=l.nextInt();
			a.add(Integer.toString(h,e).toUpperCase());
		}
		for(int y=0;y<a.size();y++)
			System.out.println(a.get(y));
	}
}