import java.util.Scanner;
import java.io.*;
public class num2458{
	static int numero(int a){
		int b=1,c=1;
		while(true){
			if(b>=a)
				break;
			c++;
			b+=c;
		}
		return c;
	}
	public static void main (String [] arg){
		Scanner l = new Scanner(System.in);
		PrintWriter std = new PrintWriter(System.out);
		int a;
		while(true){
			a=l.nextInt();
			if(a==0){
				std.close();
				break;
			}
			std.println(numero(a));
		}
	}
}