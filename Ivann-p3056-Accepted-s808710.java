import java.util.Scanner;
public class coin{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int[] a=new int[5];
		int[] b=new int[5];
		boolean m=true;
			for(int i=0;i<5;i++)
				a[i]=l.nextInt();
			for(int z=0;z<5;z++)
				b[z]=l.nextInt();
			for(int o=0;o<5;o++)
				if(a[o]==b[o]){
					m=false;
					System.out.println("N");
					break;
				}
				
				if(m)
					System.out.println("Y");
	}
}