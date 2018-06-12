import java.util.Scanner;
public class win{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		int a=e.nextInt();
		int b=e.nextInt();
		int c=0;
		int d=0;
		int m;
		String ch;
		for(int j=0;j<a;j++){
			m=e.nextInt();
			c+=m;
			
		}	
		for(int i=0;i<b;i++){
			m=e.nextInt();
			d+=m;
		}
		if(c>d)
			System.out.println("first win");
		else
			if(c<d)
				System.out.println("second win");
			else
				System.out.println("tie");
	}
}