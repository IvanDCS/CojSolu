import java.util.Scanner;
public class cosure{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int s=0;
		while(l.hasNext()){
			String op=l.next();
			if(op.equals("suma"))
				s+=l.nextInt();
			else
				if(op.equals("resta"))
				s-=l.nextInt();
		}
		System.out.print("resultado: "+s);
	}
}