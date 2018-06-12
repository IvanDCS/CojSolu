import java.util.Scanner;
import java.util.Arrays;
public class num1851{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		int [] ar= new int[a];
		int [] arn= new int[a];
		for(int u=0;u<a;u++)
			arn[u]=ar[u]=l.nextInt();
		Arrays.sort(ar);
		for(int u=0;u<a;u++){
			System.out.println((ar[a-1]-arn[u]));
		}
	}
}