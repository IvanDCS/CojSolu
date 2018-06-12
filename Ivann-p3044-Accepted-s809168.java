import java.util.Scanner;
public class guem{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int e=0,g=0;
		for(int z=0;z<4;z++)
			g+=l.nextInt();
		for(int z=0;z<4;z++)
			e+=l.nextInt();
		if(g>e)
			System.out.println("Gunnar");
		else
			if(g<e)
				System.out.println("Emma");
			else
				System.out.println("Tie");
	}
}