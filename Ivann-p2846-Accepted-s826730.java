import java.util.Scanner;
import java.util.Arrays;
public class num2846{
	public static void main(String [] args){
		Scanner l = new Scanner(System.in);
		long  nu,div_entera,num_fi;
		int s,c=l.nextInt();
		while(c-- !=0){
		s=0;
		nu=l.nextLong();
		num_fi = (nu%1000)*10; 
		div_entera = nu; 
		while (div_entera != 0) {
			num_fi+= div_entera % 10; 
			div_entera = div_entera / 10; 
		}
			if(num_fi>9999){
				num_fi%=10000;
				if(num_fi<1000){
					if(num_fi<100)
					System.out.println("00"+num_fi);
					else
						System.out.println("0"+num_fi);
				}
			}
				
			else
				if(num_fi<1000)
					System.out.println((num_fi+1000));
				else
					System.out.println(num_fi);
		}
	}
}