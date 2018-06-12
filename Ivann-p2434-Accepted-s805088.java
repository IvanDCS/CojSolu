import java.util.Scanner;
import java.util.LinkedList;
import java.math.BigInteger;
public class primo{
	public static void main(String [] arg){
		Scanner e =new Scanner(System.in);
		LinkedList <Integer> list = new <Integer> LinkedList();
		while(true){
			int n=e.nextInt();
			if(n!=0)
				list.add(n);
			else
				break;
		}
		for(int j=0;j<list.size();j++){
			BigInteger ja = new BigInteger("1");
			for(int y=0;y<=list.get(j);y++){
				if(y==2 || y==3 ||  y==5 ||  y==7)
					ja = ja.multiply(new BigInteger(y + ""));
				else	
				if(y%2!=0 && y%3!=0 && y%5!=0 && y%7!=0)
					ja = ja.multiply(new BigInteger(y + ""));
			}
			System.out.println(ja);
		}
	}
}