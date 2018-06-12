import java.util.*;
public class SegmentTree {
    String st[]; 
    String minVal(String x, String y) {
        if(x.equals("0") || y.equals("0")) return "0";
		if(x.equals("-") && y.equals("-")) return "+";
		if(x.equals("-")) return "-";
		if(y.equals("-")) return "-";
		return "+";
    }
    int getMid(int s, int e) {
        return (s + e) / 2;
    }
    String RMQUtil(int ss, int se, int qs, int qe, int index)
    {
        if (qs <= ss && qe >= se)
            return st[index];
        if (se < qs || ss > qe)
            return "+";
        int mid = getMid(ss, se);
        return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1),
                RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
    }
    String RMQ(int n, int qs, int qe)
    {
 
        return RMQUtil(0, n - 1, qs, qe, 0);
    }
    String constructSTUtil(String arr[], int ss, int se, int si)
    {
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }
        int mid = getMid(ss, se);
        st[si] = minVal(constructSTUtil(arr, ss, mid, si * 2 + 1),
                constructSTUtil(arr, mid + 1, se, si * 2 + 2));
        return st[si];
    }
    void constructST(String arr[], int n)
    {
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
		int max_size = 2 * (int) Math.pow(2, x) - 1;
        st = new String[max_size];
        constructSTUtil(arr, 0, n - 1, 0);
    }
    

String updateValueUtil( int ss, int se, int i, String new_val, int si)
{
    if (i < ss || i > se)
        return st[si];
    if(ss==se){
        return st[si]=new_val;}
        int mid = getMid(ss, se);    
        st[si] = minVal(updateValueUtil( ss, mid, i, new_val, 2*si + 1),
        updateValueUtil( mid+1, se, i, new_val, 2*si + 2));
        return st[si];
    
}
void updateValue(String arr[], int n, int i, String new_val)
{
    if (i < 0 || i > n-1)
    {
        System.out.println("Invalid Input");
        return;
    }
 
    arr[i] = new_val;
    updateValueUtil(0, n-1, i, new_val, 0);
}
    
    
 
    public static void main(String args[]) 
    {
		String [] arr;       
		Scanner l = new Scanner(System.in);
		SegmentTree tree;
		int a,b,n;
		String d;
		int j,k,h;
		int valor;
		String salida,aux;
		while(l.hasNext()){
			salida="";
			a=l.nextInt(); b=l.nextInt();
			arr = new String [a];
			n=a;
			for(int i=0;i<a;i++){
				valor=l.nextInt();
				if(valor>0){arr[i]="+"; continue;}
				if(valor<0){arr[i]="-"; continue;}
				arr[i]="0";
			}
			tree = new SegmentTree();
			tree.constructST(arr, n);
			while(b-- !=0){
				d=l.next();
				j=l.nextInt(); k=l.nextInt();
				if(d.equals("C")){
					if(k>0){tree.updateValue(arr, n, j-1, "+"); continue;}
					if(k<0){tree.updateValue(arr, n, j-1, "-"); continue;}
					tree.updateValue(arr, n, j-1, "0");
				}else{
					salida+=tree.RMQ(n, j-1, k-1);
				}
			}
			System.out.println(salida);
		}

    }
}