import java.util.*;
public class coj3073{
	static int conteo(String h){
		return h.length()-2;
	}
	public static void main (String ... args){
		Scanner l = new Scanner(System.in);
		int a=Integer.parseInt(l.nextLine());
		String salida,aux;
		while(a-- !=0){
			salida="";
			aux=l.next();
			if(aux.length()<11)
				System.out.println(aux);
			else{
				salida+=aux.charAt(0)+"";
				salida+=Integer.toString(conteo(aux));
				salida+=aux.charAt(aux.length()-1)+"";
				System.out.println(salida);
			}
			
		}
	}
}