import java.util.*;
public class Problema {
    static String ordenar(String e){
        /*int [] c = new int [256];
         for(int i=0;i<e.length();i++){
            c[e.charAt(i)]++;
        }
        //System.out.println(Arrays.toString(c));
        for(int i=1;i<c.length;i++){
            c[i]+=c[i-1];
        }
        //System.out.println(Arrays.toString(c));
       String [] b=new String [e.length()];
        for(int i=e.length()-1;i>=0;i--){
            b[--c[e.charAt(i)]] = e.charAt(i)+"";
        }
        for(int u=0;u<b.length;u++)
        n+=b[u];*/
                //System.out.println(Arrays.toString(b));
        String n="";
        char [] b=e.toCharArray();
        Arrays.sort(b);
        for(int u=0;u<b.length;u++)
            n+=b[u];
        return n;
    }
    public static void main(String ... args){
        Scanner l = new Scanner(System.in);
        String en=l.nextLine();
        System.out.println(ordenar(en));
    }
}