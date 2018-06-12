import java.util.Scanner;
public class num2851{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int c=Integer.parseInt(l.nextLine());
		while(c-- !=0){
			String sTexto=l.next();
			String p=l.next();
			int contador=0;
			while (sTexto.indexOf(p) > -1) {
			sTexto=sTexto.replaceFirst(p,"");
			contador++; 
			}
			System.out.println(contador);
		}
	}
}