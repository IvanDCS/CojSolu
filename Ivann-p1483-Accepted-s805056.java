import java.util.Scanner;
public class recu{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		String n;
		n=e.next();
		if(n.equals("square")){
			int a=e.nextInt();
			int R=a*a;
			System.out.println(R);
		}
		else
		{
			int a=e.nextInt();
			int b=e.nextInt();
			int R=a*b;
			System.out.println(R);
		}
	}
}