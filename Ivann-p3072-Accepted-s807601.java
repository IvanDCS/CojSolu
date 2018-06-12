import java.util.Scanner;
public class sandia{
	public static void main(String [] arg){
		Scanner p = new Scanner(System.in);
		int a=p.nextInt();
		int ax=a;
		for(int u=1;u<a;u++){
			ax=a-u;
			if(ax%2==0 && u%2==0){
				System.out.println("YES");
				break;
			}
		}
		if(ax==1)
			System.out.println("NO");
	}
}