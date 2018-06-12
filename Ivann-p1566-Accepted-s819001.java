import java.util.Scanner;
public class num1566{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a;
		while(true){
			a=l.nextInt();
			if(a==0)
				break;
			else{
				a=a*(a+1)*(2*a+1)/6;
				System.out.println(a);
			}
		}
	}
}