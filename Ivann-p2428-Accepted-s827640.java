import java.util.Scanner;
public class num2428{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a,c;
		while(true){
			a=l.nextInt();
			if(a==0)
				break;
			c=(int)Math.ceil(Math.sqrt(a));
			System.out.println(c);
		}
	}
}