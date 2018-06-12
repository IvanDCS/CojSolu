import java.util.Scanner;
public class Aritmetica{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		int a,b,c;
		String op,ig;
		float d;
		a=e.nextInt();
		for(int s=1;s<=a;s++){
			b=e.nextInt();
			op=e.next();
			c=e.nextInt();
			ig=e.next();
			d=e.nextFloat();
			if(op.equals("+")){
				if(d==(b+c))
					System.out.println("Yes");
				else
					System.out.println("No");
				
			}
			else
				if(op.equals("-")){
				if(d==(b-c))
					System.out.println("Yes");
				else
					System.out.println("No");
				
				}
				else
					if(op.equals("*")){
					if(d==(b*c))
					System.out.println("Yes");
					else
					System.out.println("No");
				}
				else
					if(op.equals("/")){
					if(d==((float)b/c))
						System.out.println("Yes");
					else
						System.out.println("No");
				}
		}
	}
}