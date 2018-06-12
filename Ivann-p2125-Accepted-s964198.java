import java.util.*;
public class SegmentTree {
    int st[]; 
    int minVal(int x, int y) {
        return x*y;
    }
    int getMid(int s, int e) {
        return (s + e) / 2;
    }
    int RMQUtil(int ss, int se, int qs, int qe, int index)
    {
        if (qs <= ss && qe >= se)
            return st[index];
        if (se < qs || ss > qe)
            return 1;
        int mid = getMid(ss, se);
        return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1),
                RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
    }
    int RMQ(int n, int qs, int qe)
    {
 
        return RMQUtil(0, n - 1, qs, qe, 0);
    }
    int constructSTUtil(int arr[], int ss, int se, int si)
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
    void constructST(int arr[], int n)
    {
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        st = new int[max_size];
        constructSTUtil(arr, 0, n - 1, 0);
    }
    

int updateValueUtil( int ss, int se, int i, int new_val, int si)
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
void updateValue(int arr[], int n, int i, int new_val)
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
		int [] arr;       
		Scanner l = new Scanner(System.in);
		int a,b,n;
		String d;
		int j,k,h;
		int valor;
		String salida;
		while(l.hasNext()){
			salida="";
			a=l.nextInt(); b=l.nextInt();
			arr = new int [a];
			n=a;
			for(int i=0;i<a;i++){
				valor=l.nextInt();
				if(valor>0){arr[i]=1; continue;}
				if(valor<0){arr[i]=-1; continue;}
				arr[i]=0;
			}
			SegmentTree tree = new SegmentTree();
			tree.constructST(arr, n);
			while(b-- !=0){
				d=l.next();
				j=l.nextInt(); k=l.nextInt();
				if(d.equals("C")){
					if(k>0){tree.updateValue(arr, n, j-1, 1); continue;}
					if(k<0){tree.updateValue(arr, n, j-1, -1); continue;}
					tree.updateValue(arr, n, j-1, 0);
				}else{
					h=tree.RMQ(n, j-1, k-1);
					if(h==0) salida+="0";
					else{
						if(h>0) salida+="+";
						else salida+="-";
					}
				}
			}
			System.out.println(salida);
		}

    }
}