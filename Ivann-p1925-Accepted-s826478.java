import java.util.Scanner;
import java.util.Arrays;
public class num1925{
	public static void main(String [] args){
		Scanner l = new Scanner(System.in);
		int c=l.nextInt();
		long  nu,num_inv,div_entera,resto_div;
		long [] t=new long[c];
		
		for(int u=0;u<c;u++){
		nu=l.nextLong(); 
		num_inv = 0; 
		div_entera = nu; 
		resto_div = 0; 
		while (div_entera != 0) { 
			resto_div = div_entera % 10; 
			div_entera = div_entera / 10; 
			num_inv = num_inv * 10 + resto_div; 
			}
		t[u]=num_inv;
		}
		

		Arrays.sort(t);
			for(int u=0;u<c;u++)
			System.out.println(t[u]);
	}
}