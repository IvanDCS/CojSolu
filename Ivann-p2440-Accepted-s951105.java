import java.util.*;
import java.io.*;
public class coj2440{
	static final Scanner l = new Scanner(System.in);
	static final PrintWriter std = new PrintWriter(System.out);
	static int n,m,u;
	static int [] b;
	static String T,P;
	static void kpmPreproceso() { 
        b = new int[P.length() + 1];
        n = T.length();
        m = P.length();
        int i = 0, j = -1;
        b[0] = -1; 
        while (i < m) { 
            while (j >= 0 && P.charAt(i) != P.charAt(j)) {
                j = b[j]; 
            }
            i++;
            j++; 
            b[i] = j; 
        }
    }
	static boolean  kpmSearch() { 
        int i = 0, j = 0; 
        while (i < n) { 
            while (j >= 0 && T.charAt(i) != P.charAt(j)) {
                j = b[j]; 
            }
            i++;
            j++; 
            if (j == m)  return true;
        }
		return false;
    }
	static int ind (){
		return T.indexOf('T');
	}
	public static void main(String ... args){
		int a = Integer.parseInt(l.nextLine());
		while(a-- !=0){
			T=l.next(); P=l.next();
			if(ind ()== -1 ){
				std.println("N");
				continue;
			}
			kpmPreproceso();
			std.println((kpmSearch())? "Y":"N");
			
		}
		std.close();
	}
}