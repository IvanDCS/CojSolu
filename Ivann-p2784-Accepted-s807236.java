import java.util.Scanner;
public class gladi{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		int [] ar= new int [a];
		for(int b=0;b<a;b++)
		ar[b]=l.nextInt();
		for(int i = 0; i < ar.length - 1; i++)
		for(int j = 0; j < ar.length - 1; j++)
			if (ar[j] >= ar[j+1]){
			int tmp = ar[j+1];
			ar[j+1] = ar[j];
			ar[j] = tmp;}
		
		System.out.print(ar[ar.length-1]+" ");
		for(int i = 0;i <ar.length-1; i++){
			System.out.print(ar[i]+" ");
		}
	}
}