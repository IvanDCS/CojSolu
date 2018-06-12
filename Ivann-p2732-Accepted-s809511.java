import java.util.Scanner;
public class pasamm{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		String []sa=new String[a];
		for(int u=0;u<a;u++){
			sa[u]="";
			String e =l.next();
			char[] ch =e.toCharArray();
			for(int v=0;v<ch.length;v++)
			if(Character.isUpperCase(ch[v])) 
				sa[u] += Character.toLowerCase(ch[v]); 
			else 
				sa[u] += Character.toUpperCase(ch[v]);
		}
		for(int s=0;s<a;s++)
			System.out.println(sa[s]);
	}
}