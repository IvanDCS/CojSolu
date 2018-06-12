import java.util.Scanner;
public class num2844{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		String p=l.next();
		int s=0;
		while(l.hasNext()){
			String sTexto=l.nextLine();
			int contador=0;
			while (sTexto.indexOf(p) > -1) {
			sTexto = sTexto.substring(sTexto.indexOf(
			p)+p.length(),sTexto.length());
			contador++; 
			}
			s+=contador;
		}
		System.out.println(s);
	}
}