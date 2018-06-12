import java.util.Scanner;
public class Todos{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		int a,s;
		a=e.nextInt();
		s=0;
		if(a>0)
		for(int c=1;c<=a;c++)
			s+=c;
		else
			for(int c=1;c>=a;c--)
			s+=c;
		System.out.println(s);
	}
}