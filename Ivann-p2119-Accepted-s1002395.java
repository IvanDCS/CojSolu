import java.util.*;
public class Main{
	public static void main (String ... args){
		Main obj = new Main();
		obj.Begin();
	}
	void Begin(){
		Scanner l = new Scanner(System.in);
		int a;
		Trie trie;
		String arr [];
		long suma;
		while(l.hasNext()){
			a=l.nextInt();
			suma=0;
			l.nextLine();
			trie = new Trie();
			arr = new String [a];
			for(int i=0;i<a;i++){
				arr[i]=l.nextLine();
				trie.insertWord(arr[i]);				
			}
			for(int i=0;i<a;i++){
				suma += trie.prefix(arr[i]);
			}
			System.out.printf("%.2f\n",suma/(a+0.0));;
		}
	}
	public static class Trie {
	private int size;
	private int words;
	private NodoTrie inicio;
	public int max;
	public Trie(){
       this.inicio = new NodoTrie();
	   this.max=0;
	}
   public void insertWord(String word){
       NodoTrie aux = inicio;
       for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(aux.children.get(ch)==null){
                aux.children.put(ch, new NodoTrie());   
            }
			aux=aux.children.get(ch);
			aux.setChil();
        }
       aux.isword(true); 
	}
	public long prefix(String prefix){
		NodoTrie aux=inicio;
		long suma=0;
		int act=0;
		for(int j=0;j<prefix.length();j++){
			aux=aux.children.get(prefix.charAt(j));
			if(act!=aux.getChil()) {suma++; act=aux.getChil();}
		}
		return suma;
	}
	private class NodoTrie {
		boolean isword;
		public Map<Character, NodoTrie> children;
		public int chil;
		public NodoTrie(){
			children = new TreeMap<>();
			this.chil=0;
		}
		public void setChil(){
			chil++;
		}
		public int getChil(){
			return chil;
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