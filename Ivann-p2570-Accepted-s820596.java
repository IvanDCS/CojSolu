import java.util.Scanner;
public class num2570{
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		while(l.hasNext()){
			int n=l.nextInt();
			String sn= Integer.toString(n);
			String nn="";
			for(int p=sn.length()-1;p>=0;p--)
				nn+=sn.charAt(p);
			int nf = Integer.parseInt(nn);
			if(nf>n)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}