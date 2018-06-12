import java.util.Scanner;
public class num1070{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a,b,c;
		while(l.hasNext()){
				a=l.nextInt();
				b=a*(a+1)*(2*a+1)/6;
				c=(a*(a+1)/2)*(a*(a+1)/2);
				System.out.println(b+" "+c);
		}
	}
}