import java.util.Scanner;
import java.util.StringTokenizer;
public class eseca{
	public static void main(String [] arg){
		Scanner o = new Scanner(System.in);
		int c=Integer.parseInt(o.nextLine());
		while(c-- !=0){
			String fi="";
			String s=o.nextLine().toUpperCase();
			StringTokenizer tokens = new StringTokenizer(s);
			while(tokens.hasMoreTokens()){
				String tem=tokens.nextToken();
				char[] ca = tem.toCharArray();
				tem="";
				int h=ca.length;
				while(true){
					h--;
					if(ca[h]=='S')
						ca[h]='/';
					else
						break;
					if(h==0)
						break;
				}
				tem= new String(ca);
				tem=tem.replaceAll("/","");
				fi+=tem+" ";
			}
			System.out.println(fi);
		}
	}
}