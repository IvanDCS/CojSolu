import java.util.Scanner;
public class num1177{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int n;
		String z;
		while(true){
			n=l.nextInt();
			if(n==0)
				break;
			else{
			z=l.next();
			int i=z.length()/n;
			int t=i;
			int g=0;
			 for(int a=i;a<=z.length();a+=i){
				for(int j=t-1;j>=g;j--)
					System.out.print(z.charAt(j));
					g+=i;
					t+=i;
				}
				System.out.println("");
			}
		}
	}
}