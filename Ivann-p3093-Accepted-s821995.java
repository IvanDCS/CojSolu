import java.util.Scanner;
public class modlet{
	public static void main(String [] arg){
		Scanner n = new Scanner(System.in);
		String cadena=n.nextLine();
		char[] l =cadena.toCharArray();
		int ca=1;
		for(int o=0;o<cadena.length();o++)
			ca=(ca%26*(Integer.valueOf(l[o])-64)%26)%26;
		if(ca>9)
		System.out.println(ca);
		else
			System.out.println("0"+ca);
	}
}