import java.util.Scanner;

public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int x=l.nextInt();
for(int i=0;i<x;i++){
int a=l.nextInt();
int b=l.nextInt();
int c=l.nextInt();
if((a+b)==c||(a-b)==c||(a*b)==c){	
	System.out.println("YES");
}
	else{
		if(b>0){
		 if((a/b)==c||(a%b)==c){
			System.out.println("YES");
		}else{
	System.out.println("NO");
}
	}else{
	System.out.println("NO");
}
	}

}
}
}