import java.util.Scanner;
public class num2698{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		String s=l.next();
		int su=0;
			for(int p=0;p<s.length();p++)
				su+=(int)s.charAt(p)-64;
			System.out.println(su);
	}
}