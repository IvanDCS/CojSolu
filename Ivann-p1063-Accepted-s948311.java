import java.util.*;
public class num1063{
    public static void main( String [] args ) {
		Scanner l = new Scanner(System.in);
		boolean t;
		int b,n,z,x,c;
		int [] br;
		while(true){
			t=true;
			b=l.nextInt();
			n=l.nextInt();
			if(b==0 && n==0)
				break;
			br=new int [b];
			for(int u=0;u<b;u++)
				br[u]=l.nextInt();
			for(int u=0;u<n;u++){
				z=l.nextInt()-1;
				x=l.nextInt()-1;
				c=l.nextInt();
				br[z]=br[z]-c;
				br[x]=br[x]+c;
			}
			for(int u=0;u<b;u++){
				if(br[u]<0){
					System.out.println("N");
					t=false;
					break;
				}
			}
			if(t)
				System.out.println("S");
		}
	}
}