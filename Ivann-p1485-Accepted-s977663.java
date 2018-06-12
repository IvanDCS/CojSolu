import java.util.*;
public class Problema {
    static char [] word;
    static char[] ordenar(){
        int [] c = new int [26];
        char [] p = new char [word.length];
        int i;
        for(i=0;i<word.length;i++)
            c[word[i]-97]++;
        for(i=1;i<26;i++)
            c[i]+=c[i-1];
        for(i=word.length-1;i>=0;i--){
            p[--c[word[i]-97]] = word[i];
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String en = l.nextLine();
        word = en.toCharArray();
        System.out.println(ordenar());
    }
    
}