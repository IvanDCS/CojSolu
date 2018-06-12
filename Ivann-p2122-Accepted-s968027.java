import java.util.*;
public class coj2122{
	static int q[][];
	static int padre[];
	static boolean visitado [];
	static int gg;
	static TreeMap<Integer, Boolean> nodo[];
	static void fill(int a){
		int ff=(2*a-1)*(a)+5;
		padre= new int [ff];
		visitado = new boolean [ff];
		nodo = new TreeMap[ff];
		for (int i=0; i<ff; ++i){
			nodo[i] = new TreeMap();
			padre[i]=i;
			visitado[i]=false;
		}
		for(int i=1;i<2*a+1;i++){
			q[0][i]=2;
			q[2*a][i]=4;
		}
		for(int i=0;i<2*a+1;i++){
			q[i][0]=1;
			q[i][2*a+1]=3;
		}
	}
	static void matriz(String b, int t,int i){
		for(int k=0;k<b.length();k++){
			gg++;
			if(b.charAt(k)=='H'){
				if(q[i][t-1]==0){q[i][t-1]=gg;}else{changes(i,t-1,gg);}
				if(q[i][t]==0){	 q[i][t]=gg;}else{changes(i,t,gg);}
				if(q[i][t+1]==0){q[i][t+1]=gg;}else{changes(i,t+1,gg);}
				
			}else{
				if(q[i-1][t]==0){q[i-1][t]=gg;}else{changes(i-1,t,gg);}
				if(q[i][t]==0){q[i][t]=gg;}else{changes(i,t,gg);}
				if(q[i+1][t]==0){q[i+1][t]=gg;}else{changes(i+1,t,gg);}
			}
			t+=2;
		}
	}
	static void changes(int j, int i,int v){
		nodo[q[j][i]].put(v,false);
		nodo[gg].put(q[j][i],false);
		q[j][i]=v;
	}
	static int  BFS(int s)
    {
		int n,c=0;
		visitado[s]=true;
		padre[s]=s;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
		while (queue.size() != 0)
        {
            s = queue.poll();
            Iterator ite = nodo[s].keySet().iterator();
            while (ite.hasNext())
            {
                n=Integer.parseInt(ite.next().toString());
				//System.out.print(n+"-");
                if (!visitado[n])
                {
					nodo[s].put(n,true);
                    visitado[n] = true;
					padre[n]=s;
                    queue.add(n);
                }else{
					if(padre[s]==n) continue;
					if(nodo[s].get(n))continue;
					nodo[s].put(n,true);
					nodo[n].put(s,true);
					c++;
				}
            }
			//System.out.println("");
        }
		int y=novis();
		if(novis()==0)
		return c;
		else{
			c+=BFS(y);
			return c;
		}
    }
	static int novis(){
		for(int i=1;i<visitado.length;i++)
			if(!visitado[i])
				return i;
		return 0;
	}
	static void defa(){
		nodo[1].put(2,false);
		nodo[2].put(1,false);
		nodo[1].put(4,false);
		nodo[4].put(1,false);
		nodo[2].put(3,false);
		nodo[3].put(2,false);
		nodo[3].put(4,false);
		nodo[4].put(3,false);
	}
	public static void main (String ...args){
		Scanner l = new Scanner(System.in);
		int a,ff;
		int t;
		String b;		
		while(l.hasNext()){
			a=l.nextInt();
			q=new int [2*a+1][2*a+2];
			fill(a);
			gg=4;
			for(int i=1;i<2*a;i++){
				b=l.next();
				t=((i&1)==1)?1:2;
				matriz(b,t,i);
			}
			defa();
			System.out.println((BFS(1)-1));
		}
	}
}