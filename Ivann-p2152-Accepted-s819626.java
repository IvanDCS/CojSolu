import java.util.Scanner;
public class num2152{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int c=l.nextInt();
		int p,su;
		for(int g=0;g<c;g++){
			String s=l.next();
			if(s.charAt(0)=='-'){
				su=0;
				for(p=1;p<s.length();p++)
					su+=(int)s.charAt(p)-48;
				System.out.println(su);
			}
			else{
				su=0;
				for( p=0;p<s.length();p++)
				su+=(int)s.charAt(p)-48;
				System.out.println(su);
			}
		}
	}
}