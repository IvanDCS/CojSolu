import java.util.Scanner;
import java.util.Arrays;
public class num1441{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int [] r=new int [3];
		while(true){
			r[0]=l.nextInt();
			r[1]=l.nextInt();
			r[2]=l.nextInt();
			if(r[0]==0 || r[1]==0 || r[2]==0 )
				break;
			Arrays.sort(r);
			int s=r[0]*r[0]+r[1]*r[1];
			double c= Math.pow(s,.5);
			if(c==r[2])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}