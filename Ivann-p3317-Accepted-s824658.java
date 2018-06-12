import java.util.*;
public class num3317{
	static int mo=1000000007;
	static int fib(int n){
		 int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y%mo;
            y = z;
            z = x + y;
			if(z>mo)
				z=z%mo;
        }
		return x;
    }
    public static void main( String [] args ) {
		Scanner l = new Scanner(System.in);
		int b,a=l.nextInt();
		while(a-- !=0){
			b=l.nextInt()+1;
			System.out.println(fib(b));
		}
	}
}