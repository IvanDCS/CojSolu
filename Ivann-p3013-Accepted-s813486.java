import java.util.Scanner;
public class mebus{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int v=l.nextInt();
		for(int u=0;u<v;u++){
			int p=l.nextInt();
			int r= (int) Math.pow(2,p);
			System.out.println((r-1));
		}
	}
}