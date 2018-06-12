import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    static final Scanner l = new Scanner (System.in);
    static String v, basura,fecha;
    static int [] mes = new int[13];
    static int j,c;
    static void Busqueda(){
        j=fecha.indexOf("/");
        if(fecha.charAt(j+3)=='/'){
            v=fecha.charAt(j+1)+"";
            v+=""+fecha.charAt(j+2);
            mes[Integer.parseInt(v)]++;
        }else
            mes[Character.getNumericValue(fecha.charAt(j+1))]++;
        //c =Integer.ParseInt( fecha.charAt(j+1));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a=l.nextInt();
        while(a--!=0){
            basura=l.next();
            fecha=l.next();   
            Busqueda();
        }
        for(int k=1;k<13;k++)
            System.out.println(k+" "+mes[k]);
    }
    
}