import java.util.Scanner;
public class num1935{
	public static void main(String [] arg){
		Scanner l= new Scanner(System.in);
		int t;
		while(l.hasNext()){
			t=l.nextInt();
			t*=l.nextInt()*2;
			System.out.println(t);
		}
	}
}