import java.util.Scanner;
public class angu{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		int a,b,c;
		a=e.nextInt();
		b=e.nextInt();
		c=e.nextInt();
		if(a+b+c==180){
			if(a==b && b==c)
				System.out.println("Equilateral");
			else
				if((a==b && b!=c) || (b==c && b!=a) || (a==c && c!=b))
					System.out.println("Isosceles");
			else
				if(a!=b && a!=c && c!=b)
					System.out.println("Scalene");
		}
		else
			System.out.println("Error");
	}
}