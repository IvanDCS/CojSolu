import java.util.Scanner;
public class num2281{
	public static void main(String [] arg){
		Scanner l= new Scanner(System.in);
		int a,c,j=Integer.parseInt(l.next());
		String k;
		char [][] ha;
		while(j-- != 0){
			c=0;
			k=l.next();
			a=(int)Math.sqrt(k.length());
			ha=new char[a][a];
			for(int u=0;u<a;u++)
				for(int w=0;w<a;w++){
					ha[u][w]=k.charAt(c);
					c++;
				}
			for(int u=a-1;u>=0;u--)
				for(int w=0;w<a;w++)
					System.out.print(ha[w][u]);
			System.out.println("");
		}	
	}
}