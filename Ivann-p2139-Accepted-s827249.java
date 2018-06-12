import java.util.Scanner;
public class num2139{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		String p,nq="",sTexto;
		int q;
		while(l.hasNext()){
			p=l.next();
			sTexto=l.next();
			for(int m=0;m<p.length();m++){
				q=sTexto.indexOf(p.charAt(m));
				if(q>-1){						
						sTexto=sTexto.substring(q+1,sTexto.length());
						nq="Yes";
				}
				else{
				nq="No";
				break;
				}
			}
				System.out.println(nq);				
		}
	}
}