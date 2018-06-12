import java.util.Scanner;
public class coj1188{
	static int b;
	static int a;
	static int parte1[];
	static int parte2[];
	public static void main(String[] args) {
		Scanner l=new Scanner (System.in);
		
		a=l.nextInt();
		parte1=new int [String.valueOf(a).length()];
		b=l.nextInt();
		parte2=new int [String.valueOf(b).length()];
		int suma=0,c=0;
		while(a!=0){
			parte1[c]=a%10;
			a/=10;
			c++;
		}
		c=0;
		while(b!=0){
			parte2[c]=b%10;
			b/=10;
			c++;
		}
		for (int i=0;i<parte1.length;i++ )
		{
			for(int i2=0;i2<parte2.length;i2++)
			{
				suma+=parte1[i]*parte2[i2];
			}	
		}
		System.out.println(suma);
	}
}