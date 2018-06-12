import java.util.*;
public class coj2250{
	static String T, P;
    static int n, m,u;
    static int[] b;

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
		int gh=l.nextInt();
		int mm=1;
		while(gh--!=0){
			T = l.next();
			P = l.next();
			u=0;
			kpmPreproceso();
			kpmSearch();
			System.out.println("Case "+mm+": "+u);
			mm++;
		}
        
    }

    static void kpmPreproceso() { 
        b = new int[P.length() + 1];
        n = T.length();
        m = P.length();
        int i = 0, j = -1;
        b[0] = -1; 
        while (i < m) { 
            while (j >= 0 && P.charAt(i) != P.charAt(j)) {
                j = b[j]; 
				//System.out.println(j);
            }
            i++;
            j++; 
            b[i] = j; 
        }
    } 

    static void kpmSearch() { 
        int i = 0, j = 0; 
        while (i < n) { 
            while (j >= 0 && T.charAt(i) != P.charAt(j)) {
                j = b[j]; 
            }
            i++;
            j++; 
            if (j == m) { 
                //System.out.format("P se encuentra en el indice %d en T\n", i - j);
                u++;
				j = b[j]; 
            }
        }
    }
}