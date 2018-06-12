import java.util.Scanner;
public class num3349{
	static long potencia(long base,long exponete,long modulo){
		if(exponete==0)
			return 1;
		if(exponete%2==0){
			long u =(potencia(base,exponete/2,modulo)%modulo);
			return (u*u)%modulo;
		}else
			return (base%modulo)*(potencia(base,exponete-1,modulo))%modulo;
	}
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		while(a-- !=0){
			long c=l.nextLong();
			System.out.println(potencia(2,c,1000000007)-1);
		}
	}
}