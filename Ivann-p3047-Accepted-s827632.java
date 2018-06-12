import java.util.Scanner;
public class num3047{
	static int gcd(int a,int b){
		return (b==0 ? a: gcd(b,a%b));
	}
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int r,a,c,b=l.nextInt();
		while(b-- !=0){
			r=0;
			r=2*(a=l.nextInt());
			r+=2*(c=l.nextInt());
			if(a==c){
			System.out.println("4");
			continue;
			}
			r/=gcd(a,c);
			System.out.println(r);
		}
		
	}
}