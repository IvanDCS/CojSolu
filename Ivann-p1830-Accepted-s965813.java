import java.util.*;
import java.io.*;
public class coj1830{
    long st[]; 
    coj1830(int n)
    {    int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
 
        st = new long[max_size];
    }
    int getMid(int s, int e) {
        return s + (e - s) / 2;
    }
    long getSumUtil(int ss, int se, int qs, int qe, int si)
    {
        if (qs <= ss && qe >= se)
            return st[si];
        if (se < qs || ss > qe)
            return 0;
         int mid = getMid(ss, se);
        return (getSumUtil(ss, mid, qs, qe, 2 * si + 1)+
                getSumUtil(mid + 1, se, qs, qe, 2 * si + 2))%10000;
    }
  void updateValueUtil( int ss, int se, int i, int new_val, int si)
{
	if (i < ss || i > se)
            return;
        st[si] = (st[si]%10000 + new_val%10000)%10000;
        if (se != ss) {
            int mid = getMid(ss, se);
            updateValueUtil(ss, mid, i, new_val, 2 * si + 1);
            updateValueUtil(mid + 1, se, i, new_val, 2 * si + 2);
        }
	/*
    if(ss==se){
		st[si]+=new_val;
        return st[si];
	}

        int mid = getMid(ss, se);    
        st[si] = updateValueUtil( ss, mid, i, new_val, 2*si + 1)+
        updateValueUtil( mid+1, se, i, new_val, 2*si + 2);
        return st[si];*/
    
}
	void updateValue(int n, int i, int new_val)
{
    if (i < 0 || i > n-1)
    {
        System.out.println("Invalid Input");
        return;
    }
 
//    arr[i] = new_val;
    updateValueUtil(0, n-1, i, new_val, 0);
    
}

    long getSum(int n, int qs, int qe)
    {
        if (qs < 0 || qe > n - 1 || qs > qe) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0, n - 1, qs, qe, 0);
    }
    public static void main(String args[])
    {
        Scanner l = new Scanner(System.in);
		PrintWriter std = new PrintWriter(System.out);
		int n=l.nextInt(); int u=l.nextInt(); int q=l.nextInt();
		int d,j;
		coj1830  tree = new coj1830(n);
		while(u-- !=0){
		d=l.nextInt(); j=l.nextInt();
		if((d-2)>-1) tree.updateValue(n, d-2, j);
		if(d<n) tree.updateValue(n, d, j);
		tree.updateValue(n, d-1, j+1);
		}
		while(q-- !=0){
			d=l.nextInt(); j=l.nextInt();
			std.println(tree.getSum(n, d-1, j-1));
		}
			std.close();
	}	
}