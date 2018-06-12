import java.util.Scanner;
public class proje{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int p,s=0;
		int m=l.nextInt();
		int [] r=new int [m];
		for(int n=0;n<m;n++)
			r[n]=l.nextInt();
		
		for(int f=0;f<m;f++){
			p=(r[f]*(f+1))-s;
			s+=p;
			System.out.print(p+" ");
		}
			
	}
}