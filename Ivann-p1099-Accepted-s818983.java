import java.util.Scanner;
public class num1099{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		while(true){
			int a,b,c;
			a=l.nextInt();
			if(a==0)
				break;
			else{
				b=l.nextInt();
				c=l.nextInt();
				a=a*a;
				b=b*b;
				c=c*c;
				if(a+b==c ||a+c==b || b+c==a)
					System.out.println("right");
				else
					System.out.println("wrong");
			}
				
		}
	}
}