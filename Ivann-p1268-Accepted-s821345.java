import java.util.Scanner;  
public class hometask{  
     public static void main(String[] args) {  
          Scanner sc = new Scanner(System.in);  
         int n;  
         n=sc.nextInt();
		 boolean a=true;
if(n==1){
	 System.out.println("YES"); 
}else
if(n<=4){
	 System.out.println("NO"); 
}else{
for(int i = 2; i * i <= n; ++i){
	if(n!=i){
	if(n%i==0){
		System.out.println("YES");
		a=false;
		break;
	}
}
}
if(a)
	System.out.println("NO");
}

}
}