import java.util.Scanner;
public class cuadrante{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		while(true){
			double x=l.nextDouble();
			double y=l.nextDouble();
			if(x==0 && y==0){
				System.out.println("AXIS");
				break;	
			}
			else{
				if(x>0 && y>0)
					System.out.println("Q1");
				else 
					if(x<0 && y<0)
						System.out.println("Q3");
					else
					if(x<0 && y>0)
						System.out.println("Q2");
					else 
					if(x>0 && y<0)
						System.out.println("Q4");
					else
						if(x==0 || y==0)
						System.out.println("AXIS");
			}
		}
	}
}