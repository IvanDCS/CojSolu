import java.util.Scanner;
public class num1679{
	public static void main(String []arg){
		Scanner l = new Scanner(System.in);
		int c=l.nextInt();
		double ax=0;
		String ga="";
		for(int u=0;u<c;u++){
			String n=l.next();
			double s=Math.log10(l.nextInt());
			s+=l.nextInt();
			s+=(2*l.nextInt());
			s+=l.nextInt();
			int a=l.nextInt();
			int b=l.nextInt();
			s-=(a+b*b);
			if(s>ax){
				ga=n;
				ax=s;
			}
				
		}
		System.out.println(ga);
	}
}