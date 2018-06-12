import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> total=new ArrayList<String>();

int a=Integer.parseInt(l.nextLine());

for(int j=0;j<a;j++){
	String s=l.nextLine();
for(int i=0;i<s.length();i++){
total.add(""+s.charAt(i));

}
if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
total.add("cow");	
}else{
String aux=""+s.charAt(0);
total.remove(0);
total.add(aux);
total.add("ow");	
	
}
for(int i=0;i<total.size();i++){
System.out.print(total.get(i));

}
System.out.println("");
total.clear();
}


}
}