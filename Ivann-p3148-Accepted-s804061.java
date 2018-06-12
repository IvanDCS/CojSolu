import java.util.Scanner;
public class ajedrez {
	public static void main(String [] arg){
		Scanner en = new Scanner(System.in);
		String l;
		int n,c;
		String[] o;
		c=en.nextInt();
		o=new String[c];
		for(int y=0;y<c;y++)
			o[y]=en.next();
		for(int y=0;y<c;y++){
			l=o[y].substring(0,1);
			String co=o[y].substring(1);
			n=Integer.parseInt(co);
			if((l.equals("a"))||(l.equals("c"))||(l.equals("e"))||(l.equals("g"))){
				if(n%2==0)
					System.out.println("BLACK");
				else
					System.out.println("WHITE");
			}else 
				if((l.equals("b"))||(l.equals("d"))||(l.equals("f"))||(l.equals("h"))){
					if(n%2==0)
						System.out.println("WHITE");
					else
						System.out.println("BLACK");
				}
		}
	}
}