import java.util.Scanner;
import java.util.Arrays;
public class orde{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		int i=e.nextInt();
		int [] l=new int [i];
		for(int z=0;z<i;z++)
			l[z]=e.nextInt();
		Arrays.sort(l);
		for(int o=0;o<i;o++)
				System.out.println(l[o]);
	}
}