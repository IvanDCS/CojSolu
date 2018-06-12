import java.util.Scanner;
public class num1840{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		for(int b=0;b<a;b++){
			String s=l.next();
		int t[] = {0, 0, 0, 0, 0,0};
		while(true){
			if(s.indexOf('B')!=-1){
					t[0]++;
					s=s.replaceFirst("B","");
				}else
				if(s.indexOf('R')!=-1){
				t[1]++;
				s=s.replaceFirst("R","");
				}else
				if(s.indexOf('O')!=-1){
				t[2]++;
				s=s.replaceFirst("O","");
				}else
				if(s.indexOf('K')!=-1){
				t[3]++;
				s=s.replaceFirst("K","");
				}else
				if(s.indexOf('E')!=-1){
				t[4]++;
				s=s.replaceFirst("E","");
				}else
				if(s.indexOf('N')!=-1){
				t[5]++;
				s=s.replaceFirst("N","");
				}else
					break;
		}				
			if(t[0]==t[1] && t[1]==t[2] && t[2]==t[3] && t[3]==t[4] && t[4]==t[5])
				System.out.println("No Secure");
			else
				System.out.println("Secure");
			
		}
	}
}