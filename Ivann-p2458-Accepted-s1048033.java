import java.io.*;
import java.util.*;
public class coj2458{
	static final PrintWriter writer = new PrintWriter(System.out);
	static long numero(long N){
		long result = 1;
		long nN = 1;
		while(result < N){
			nN++;
			result =  (nN*(nN+1))/2;
		}
		return nN;
	}
	public static void main(String ... args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		while(N!=0){
			 writer.println(numero(N));
			N = Long.parseLong(br.readLine());
		}
		writer.close();
	}
}