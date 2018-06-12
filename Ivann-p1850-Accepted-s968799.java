import java.util.*;
import java.io.*;
public class SegmentTree {
    long st[]; 
    long minVal(long x, long y) {
        return (x%10000+y%10000)%10000;
    }
    int getMid(int s, int e) {
        return (s + e) / 2;
    }
    long RMQUtil(int ss, int se, int qs, int qe, int index)
    {
        if (qs <= ss && qe >= se)
            return st[index];
        if (se < qs || ss > qe)
            return 0;
        int mid = getMid(ss, se);
        return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1),
                RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
    }
    long RMQ(int n, int qs, int qe)
    {
 
        return RMQUtil(0, n - 1, qs, qe, 0);
    }
    void constructST(long arr[], int n)
    {
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        st = new long[max_size];
        
    }
    

	long updateValueUtil( int ss, int se, int i, long new_val, int si)
	{
    if (i < ss || i > se)
        return st[si];
    if(ss==se){
        return st[si]+=new_val;}
        int mid = getMid(ss, se);    
        st[si] = minVal(updateValueUtil( ss, mid, i, new_val, 2*si + 1),
        updateValueUtil( mid+1, se, i, new_val, 2*si + 2));
        return st[si];
    
	}
void updateValue(long arr[], int n, int i, long new_val)
{
    if (i < 0 || i > n-1)
    {
        System.out.println("Invalid Input");
        return;
    }
 
    arr[i] += new_val;
    updateValueUtil(0, n-1, i, new_val, 0);
}
 
    public static void main(String args[]) 
    {
		long [] arr;       
		Scanner l = new Scanner(System.in);
		PrintWriter std = new PrintWriter(System.out);
		int a,n;
		long b,aux;
		int j,k,h;
		int valor;
		n=a=l.nextInt(); b=l.nextLong(); b+=l.nextLong();
		arr = new long [a];
		SegmentTree tree = new SegmentTree();
		tree.constructST(arr, n);
		while(b-- !=0){
				h=l.nextInt();
				j=l.nextInt();
				k=l.nextInt();
				if(h==1){
					aux=k*2;
					if(j<a){tree.updateValue(arr, n, j, (long)k);}
					if((j-2)>-1){tree.updateValue(arr, n, j-2, (long)k);}
					tree.updateValue(arr, n, j-1, aux);
				}else{
					std.println(tree.RMQ(n, j-1, k-1));
				}
			}
		std.close();
    }
}