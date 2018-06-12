import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.PrintWriter;
public class coj1991{
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final StringBuilder sc  = new StringBuilder();
	static  String pos [] ={"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
	static final PrintWriter std = new PrintWriter(System.out);
	static String T, P;
    static int n, m,u,a,basura;
    static int[] b;
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

    static void kpmSearch() { 
        int i = 0, j = 0;
		u=0;
        while (i < n) { 
            while (j >= 0 && T.charAt(i) != P.charAt(j)) {
                j = b[j]; 
            }
            i++;
            j++; 
            if (j == m) { 
                u++;
				j = b[j]; 
            }
        }
    }
	public static void main (String ... agrs ) throws IOException
	{
		int c=Integer.parseInt(br.readLine());
		int z=1;
		while(c--!=0){
			sc.setLength(0);
			basura=Integer.parseInt(br.readLine());	T = br.readLine();
			sc.append(z+""+" ");
			z++;
			u=0;
			for(a=0;a<8;a++){
				P=pos[a];
				kpmPreproceso();
				kpmSearch();
				if(a!=7)
				sc.append(u+" ");
				else
					sc.append(u);
			}
			std.println(sc);
		}
		std.close();		
	}
}