import java.util.Scanner;
public class num1762{
    public static void main(String args[]){
        Scanner  l = new Scanner(System.in);
		String a=l.next();
		String b=l.next();
		int n,o=0,m=100000;
		for(int u=0;u<b.length();u++){
			n=a.indexOf(b.charAt(u));
				if(n!=-1){
					if(n<m){
						m=n;
						o=u;
					}
				}
			}
		for(int u=0;u<b.length();u++){
			if(o==u){
				System.out.println(a);
				continue;
			}
			for(int w=0;w<a.length();w++)
				if(w==m)
					System.out.print(b.charAt(u));
				else
					System.out.print(".");
			
			System.out.println("");
		}
	}
}