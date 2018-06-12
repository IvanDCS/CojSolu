import java.util.Scanner;
public class num1683{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int n=l.nextInt();
for(int i=1;i<=n;i++){
	int x=l.nextInt();
	int sum=0;
	for(int d=1;d<x;d++){
		if(x%d==0)
			sum+=d;
	}
if(sum<x){
	System.out.println("Deficient");
}
	
if(sum==x){
	System.out.println("Perfect");
}
		
if(sum>x){
	System.out.println("Abundant");
}
		
		}
	}
}