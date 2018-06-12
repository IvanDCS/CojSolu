import java.util.Scanner;
public class num2946{
	public static void main(String []arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		while(a-- != 0){
			int n=l.nextInt();
			if(n%2==0){
				while(true){
					n=n/2;
					if(n%2!=0)
						break;
				}
			System.out.println(n);
			}
			else{
				n=n*2;
				System.out.println(n);
			}
				
		}
	}
}