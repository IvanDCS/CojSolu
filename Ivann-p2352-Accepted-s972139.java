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
			trie = new Trie();
			c=l.nextInt();
			f=true;
			while(c--!=0){
				String temp = l.next().trim();
				if(!f)continue;
				
				ArrayList <Integer> lis = new ArrayList<Integer>();
				for (int i = 0; i < temp.length(); i++)
				{
					lis.add(temp.charAt(i) - '0');
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
	public Trie(){
       this.inicio = new NodoTrie();
	}
	
	public boolean insertWord(ArrayList<Integer> lis){
       NodoTrie aux;
       aux=inicio;
       for(int i=0;i<lis.size();i++){
		   int p=lis.get(i);
            if(aux.children.get(p)==null){
                aux.children.put(p, new NodoTrie());   
            }
			aux=aux.children.get(p);
			if(aux.isword()) return true;
        }
		boolean f=comprobacion(aux);
		if(!f)aux.isword(true);
		return f; 
	}
	public boolean comprobacion(NodoTrie aux){
	if(aux.children.size()!=0)	return true;
		return false;
	}
	private class NodoTrie {
		boolean isword;
		public Map<Integer, NodoTrie> children;
		public int chil;
		public NodoTrie(){
        children = new TreeMap<>();
		this.chil=0;
		}
		public void  isword(boolean isword){
			this.isword=isword;
		}
		public boolean isword(){
			return isword;
		}
}
}
}