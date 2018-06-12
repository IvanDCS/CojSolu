import java.util.Scanner;
import java.math.BigInteger;
public class potencias{
public static void main(String[]args){
       Scanner in = new Scanner(System.in);
       BigInteger dos = new BigInteger("2");
       int n = in.nextInt();
	   System.out.println(dos.pow(n));
    }
    
}