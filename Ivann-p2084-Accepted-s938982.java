import java.util.*;
public class coj2084{
	static final Scanner l = new Scanner(System.in);
	static String [] mapar;
	static final int dr [] = {1,1,0,-1,-1,-1,0,1};
	static final int dc [] = {0,1,1,1,0,-1,-1,-1};
	static int Tyu;
	static char [][] mapa;
	static boolean esValido(int r, int c){
		return (r>=0 && r < Tyu && c>= 0 && c < Tyu);
	}
	static  int floodfill(int r, int c, char c1, char c2) {
		if(!esValido(r,c)) return 0;
		if(mapa[r][c]!=c1) return 0;
		int ans = 1;
		mapa[r][c]=c2;
		for(int d =0;d<8;d++)
			ans += floodfill(r+dr[d], c+dc[d],c1,c2);
		return ans;
	}
	static void transformada(int r){
		mapa = new char [r] [r];
		for(int a = 0;a<r;a++)
			for (int papu=0;papu<r;papu++)
				mapa[a][papu] = mapar[a].charAt(papu);
	}
	public static void main (String ... args){
	List <Integer> lista = new ArrayList<Integer>();
	Tyu=Integer.parseInt(l.nextLine());
	while(Tyu!=0){
		mapar = new String [Tyu];
		for(int i=0;i<Tyu;i++){
			mapar[i] = l.nextLine();
			
		}
		transformada(Tyu);
		for(int k=0;k<Tyu;k++)
			for(int h=0;h<Tyu;h++)
				if(mapa[k][h]=='l')
					lista.add(floodfill(k,h,'l','s'));
		Collections.sort(lista);
		if(lista.size()==0)
		System.out.println("0"+" "+"0"+" "+"0");
		else
		System.out.println(lista.size()+" "+lista.get(0)+" "+lista.get(lista.size()-1));
		lista.clear();
		Tyu=Integer.parseInt(l.nextLine());
	}
		
	}

}