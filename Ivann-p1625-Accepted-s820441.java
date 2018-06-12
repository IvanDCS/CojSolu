import java.util.*;
public class num1625{
	public static void main(String []arg){
		Calendar fecha= Calendar.getInstance();
		Scanner l = new Scanner(System.in);
		int me=0,y=0,dn=0;
		int a=l.nextInt();
		while(a-- != 0){
			y=l.nextInt();
			String m=l.next();
			if(m.equals("JANUARY"))
				me=0;
			if(m.equals("FEBRUARY"))
				me=1;
			if(m.equals("MARCH"))
				me=2;
			if(m.equals("APRIL"))
				me=3;
			if(m.equals("MAY"))
				me=4;
			if(m.equals("JUNE"))
				me=5;
			if(m.equals("JULY"))
				me=6;
			if(m.equals("AUGUST"))
				me=7;
			if(m.equals("SEPTEMBER"))
				me=8;
			if(m.equals("OCTOBER"))
				me=9;
			if(m.equals("NOVEMBER"))
				me=10;
			if(m.equals("DECEMBER"))
				me=11;
			dn=l.nextInt();
			fecha.set(y,me,dn);
			int dia = fecha.get(Calendar.DAY_OF_WEEK);
			switch(dia){
				case 1:
				System.out.println("SUNDAY");
				break;
				case 2:
				System.out.println("MONDAY");
				break;
				case 3:
				System.out.println("TUESDAY");
				break;
				case 4:
				System.out.println("WEDNESDAY");
				break;
				case 5:
				System.out.println("THURSDAY");
				break;
				case 6:
				System.out.println("FRIDAY");
				break;
				case 7:
				System.out.println("SATURDAY");
				break;
			}
		}
	}
}