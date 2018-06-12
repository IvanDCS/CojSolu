import java.util.Scanner;
public class num2196{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int q=l.nextInt();
		for(int p=0;p<q;p++){
			String s=l.next();
			int c=Integer.parseInt(""+s.charAt(s.length()-1));
			if(c%2==0)
			System.out.println("even");
			else
				System.out.println("odd");
		}
	}
}