import java.util.*;
import java.io.*;
public class coj1807{
	static final Scanner l = new Scanner(System.in);
	static int pore;
	static int total;
	static int buenas(String k){
		return k.replace("#","").length();
	}
	static void conteo(String h){
		h=h.trim();
		total+=h.length();
		pore+=buenas(h);
	}
	public static void main(String... args) {
		String line;
		int c=Integer.parseInt(l.nextLine());
		while(c -- !=0){
			pore=0;
			total=0;
			while((line = l.nextLine()).equals("") == false){
				conteo(line);
			}
			if ((pore*100 % total) == 0) System.out.printf("Efficiency ratio is %d%%.\n",(pore*100)/total);
			else{ 
				int cab = pore*1000/total; 
				if (pore*1000 % total >= (total+1)/2) cab++; 
				if (cab % 10 == 0) System.out.printf("Efficiency ratio is %d%%.\n", cab/10); 
				else System.out.printf("Efficiency ratio is %d.%d%%.\n", cab/10, cab%10); 
			}
		}
	}
}