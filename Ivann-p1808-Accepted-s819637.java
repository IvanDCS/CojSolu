import java.util.Scanner;
public class num1808{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		while(true){
			int s=0;
			String a=l.next();
			if(a.equals("X"))
				break;
			String b=l.next();
			for(int p=0;p<a.length();p++){
				if(a.charAt(p)==b.charAt(p))
					s++;
			}
			System.out.println("Hamming distance is "+(a.length()-s)+".");
		}
	}
}