import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;
public class strdiv{
	public static void main(String [] arg){
		Scanner en= new Scanner(System.in);
		LinkedList <Integer> or = new <Integer> LinkedList();
		String se;
		se=en.nextLine();
		StringTokenizer st = new StringTokenizer(se,"+");
		
        while (st.hasMoreTokens())
			or.add(Integer.parseInt(st.nextToken()));	
		
		 int i, j, aux;
         for(i=0;i<or.size()-1;i++){
			 for(j=0;j<or.size()-i-1;j++)
                   if(or.get(j+1)<or.get(j)){
                      aux=or.get(j+1);
                      or.set(j+1,or.get(j));
                      or.set(j,aux);
				   }
		 }
		 String salida="";
		 for(i=0;i<or.size();i++){
			 if(i+1==or.size()){
				 salida+=or.get(i)+"";
			 }else
			salida+=or.get(i)+"+"; 
		 }
            
		
		System.out.println(salida);
	}
}