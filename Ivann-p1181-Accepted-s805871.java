import java.util.Scanner;
public class bee{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int a=1;
int total=1;
int machos=0;
int hembras=1;
a=l.nextInt();
while(a!=-1){
	
for(int i=0;i<a;i++){
hembras=machos+1;
machos=total;
total=(machos+hembras);
}
System.out.println(machos+" "+total);
total=1;
machos=0;
hembras=0;
a=l.nextInt();
}
}
}