import java.util.Scanner;
public class num2948{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int c=l.nextInt();
		for(int p=0;p<c;p++){
			String li=l.next();
			int su=10;
			do{
				su=0;
				for(int r=0;r<li.length();r++)
				su+=Integer.parseInt(""+li.charAt(r));
				li=Integer.toString(su);
			}while(su>9);
			System.out.println(su);
		}
	}
}