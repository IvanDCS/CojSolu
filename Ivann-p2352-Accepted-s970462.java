import java.util.*;
public class coj{
	public static void main (String [] args){
		Scanner l = new Scanner(System.in);
		int a,b,c;
		Trie trie;
		long number;
		boolean f;
		a=l.nextInt();
		while(a--!=0){
			trie = new Trie(10);
			c=l.nextInt();
			f=true;
			while(c--!=0){
				String temp = l.next().trim();
				if(!f)continue;
				
				ArrayList <Integer> lis = new ArrayList<Integer>();
				for (int i = 0; i < temp.length(); i++)
				{
					lis.add(temp.charAt(i) - '0');
					//System.out.println(lis.get(i));
				}
				if(trie.insertWord(lis)) f=false;
			}
			System.out.println(f ? "YES" : "NO" ); 
		}
	}
public static class Trie {
	public int size;
	public int words;
	public NodoTrie inicio;
	public Trie(int alfa){
       this.inicio = new NodoTrie(alfa);
	}
	
	public boolean insertWord(ArrayList<Integer> lis){
       NodoTrie aux;
       aux=inicio;
       for(int i=0;i<lis.size();i++){
		   int p=lis.get(i);
            if(aux.getNodo(p)==null){
                aux.setNodo(p);
                aux=aux.getNodo(p);
            }else{
				aux=aux.getNodo(p);
            }
			if(aux.isword()) return true;
        }
		boolean f=comprobacion(aux);
		if(!f)aux.isword(true);
		return f; 
	}
	public boolean comprobacion(NodoTrie aux){
		for(int i=0;i<10;i++){
			if(aux.getNodo(i)!=null)
				return true;
		}
		return false;
	}
	private class NodoTrie {
		boolean isword;
		public NodoTrie nodos [];
		public NodoTrie(int alfa){
			nodos = new NodoTrie[alfa];
		}
		public void  isword(boolean isword){
			this.isword=isword;
		}
		public boolean isword(){
			return isword;
		}
		public NodoTrie getNodo(int pos){
			return nodos[pos];
		}
		public void setNodo(int p){
			nodos[p]=new NodoTrie(nodos.length);
		}
}
}
}