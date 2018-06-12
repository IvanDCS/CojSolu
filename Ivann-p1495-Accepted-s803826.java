import java.util.Scanner;
public class Asce{
	public static void main(String [] arg){
		Scanner e = new Scanner(System.in);
		int a,ax;
		a=e.nextInt();
		int [] b;
		b= new int[a]; 
		for(int i=0;i<a;i++)
			b[i]=e.nextInt();
		
		for(int y=0;y<a;y++){
			for(int j=y+1;j<a;j++){
				if(b[y]<=b[j]){
				}else{
					ax=b[y];
					b[y]=b[j];
					b[j]=ax;
				}
			}
			System.out.println(b[y]);
		}
			
	}
}