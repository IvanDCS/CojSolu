import java.util.ArrayList;
import java.util.Scanner;
public class num2444{
    public static void main(String args[]){
        Scanner  l = new Scanner(System.in);
		ArrayList<Integer> li=new <Integer>ArrayList();
		int t,c=0;
		while(l.hasNext())
			li.add(l.nextInt());
		for(int w=0;w<li.size();w++){
			t=0;
			String b = Integer.toString(li.get(w), 2);
			while(true)
			if(b.indexOf('1')!=-1){
					t++;
					b=b.replaceFirst("1","");
				}else
					break;
			if(t%2!=0)
				c++;
		}
		System.out.println((li.size()-c));
	}
}