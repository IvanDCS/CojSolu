import java.util.Scanner;
public class num2736{
    public static void main(String args[]){
        Scanner  l = new Scanner(System.in);
		String a=l.next();
		int c;
		while(true){
			System.out.println(a);
			c=0;
		while(true){
			if(a.indexOf('1')!=-1){
					a=a.replaceFirst("1","");
					c++;
				}else
					break;
			}
			a = Integer.toString(c, 2);
			if(c==1)
					break;
		}
	}
}