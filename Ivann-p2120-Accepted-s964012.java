import java.util.*;
public class coj2120{
	static int [] arr;
	static boolean repetido(int y){
		String k=Integer.toString(y);
		String aux;
		for(int i=0;i<k.length();i++){
			aux=k.replace(k.charAt(i)+"","");
			//System.out.println(aux);
			if((k.length()-1)>aux.length()) return true;
		}
		return false;
	}
	static void construcion(){
		arr=new int [5001];
		int aco=0;
		for(int i=1;i<5001;i++){
			if(repetido(i)){
				arr[i]=aco; }
			else{
				aco=aco+1; arr[i]=aco; }
		}
	}
	public static void main (String ... args){
		Scanner l = new Scanner(System.in);
		construcion();
		int a,b;
		while(l.hasNext()){
			a=l.nextInt(); b=l.nextInt();
			System.out.println(arr[b]-arr[a-1]);
		}
	}
}