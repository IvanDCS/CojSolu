import java.util.*;
public class OrdenarPor {
    public static void main( String [] args ) {
		Scanner l = new Scanner(System.in);
        int oro,plata,bronce;
		ArrayList <Persona> Arr= new ArrayList <Persona> ();
		for(int u=1;u<=7;u++){
			oro=l.nextInt();
			plata=l.nextInt();
			bronce=l.nextInt();
			Arr.add(new Persona(oro,plata,bronce,u));
		}
        Comparator<Persona> comparador =  new Comparator<Persona>() {
            public int compare( Persona a, Persona b ) {
                int resultado = Integer.compare( a.oro(), b.oro());
                if ( resultado != 0 ) { return resultado; }
                
                resultado = Integer.compare( a.plata(), b.plata()); 
                if ( resultado != 0 ) { return resultado; }
                
                resultado = Integer.compare( a.bronce(), b.bronce()); 
                if ( resultado != 0 ) { return resultado; }
                
                resultado = Integer.compare( a.indice(), b.indice());
                return resultado;
            }
        };
		Collections.sort(Arr,comparador);
		for(int u=6;u>=0;u--)
        System.out.println(Arr.get(u));
    }
}
class Persona {
   public int oro;
   public int plata;
   public int bronce;
   public int indice;
    public Persona(int oro, int plata, int bronce, int indice) {
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
        this.indice = indice;
    }
    public String toString() {
        return "Facultad "+indice+" "+oro+" "+plata+" "+bronce;
    }

	public int oro() { return oro; }
	public int plata() { return plata; }
	public int bronce() { return bronce; }
	public int indice() { return indice; }
}