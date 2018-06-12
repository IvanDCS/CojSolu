import java.util.*;
public class num2344{
    public static void main( String [] args ) {
		Scanner l = new Scanner(System.in);
        int oro,plata,bronce;
		String nombre;
		ArrayList <Medal> Arr= new ArrayList <Medal> ();
		boolean g=false;
		while(true){
		while(true){
			nombre =l.next();
			if(nombre.equals("@"))
				break;
			if(nombre.equals("#")){
				g=true;
				break;
			}
			oro=Integer.parseInt(l.next());
			plata=Integer.parseInt(l.next());
			bronce=Integer.parseInt(l.next());
			Arr.add(new Medal(nombre,oro,plata,bronce));
		}
        Comparator<Medal> comparador =  new Comparator<Medal>() {
            public int compare( Medal a, Medal b ) {
                int resultado = Integer.compare( a.oro(), b.oro());
                if ( resultado != 0 ) { return resultado; }
                
                resultado = Integer.compare( a.plata(), b.plata()); 
                if ( resultado != 0 ) { return resultado; }
                
                resultado = Integer.compare( a.bronce(), b.bronce()); 
                if ( resultado != 0 ) { return resultado; }
                
               resultado = b.nombre().compareTo(a.nombre()); 
                 return resultado; 
            }
        };
		Collections.sort(Arr,comparador);
		for(int u=Arr.size()-1;u>=0;u--){
			System.out.println(Arr.get(u));
		}
		if(g)
			break;
		System.out.println("@");
		Arr.clear();
		}
    }
}
class Medal {
   public String nombre;
   public int oro;
   public int plata;
   public int bronce;
    public Medal(String nombre, int oro, int plata, int bronce) {
		this.nombre=nombre;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }
    public String toString() {
        return nombre;
    }

	public int oro() { return oro; }
	public int plata() { return plata; }
	public int bronce() { return bronce; }
	public String nombre() { return nombre; }
}