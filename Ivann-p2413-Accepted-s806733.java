import java.util.Scanner;
public class cinco{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int c=l.nextInt();
		String p;
		for(int y=0;y<c;y++){
			p=l.next();
			int v=p.length();
			char car=p.charAt(v-1);
			if(car=='5' || car=='0')
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}