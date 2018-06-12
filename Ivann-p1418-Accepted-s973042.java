import java.util.*;
import java.io.*;
public class Main{
	public static void main(String ... args){
		Main obj = new Main();
		obj.Begin();
	}
	static boolean Vocal(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	public String trans(String word){
		if(word.length()==0) return "";
		if(Vocal(word.charAt(0))){
			word+="ay";
		}else{
			char aux=word.charAt(0);
			word=word.substring(1,word.length())+aux+"ay";
		}
		return word;
	}
	public void Begin(){
		try{
			String ou;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder out = new StringBuilder();
			int value;
			String generic="";
			 while((value = in.read()) != -1)
			{
				char c = (char)value;
				if (Character.isLetter(c)){
					generic+=c;
				}else{
					System.out.print(trans(generic));
					System.out.print(c);
					generic="";
				}
			}
			//System.out.println(out);
		}catch(Exception e){
         e.printStackTrace();
      }
		
	}
}