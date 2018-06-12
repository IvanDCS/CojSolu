import java.util.*;
import java.io.*;
public class SegmentTree {
    int st[]; 
    int minVal(int x, int y) {
        return (x < y) ? x : y;
    }
    int getMid(int s, int e) {
        return (s + e) / 2;
    }
    int RMQUtil(int ss, int se, int qs, int qe, int index)
    {
        if (qs <= ss && qe >= se)
            return st[index];
        if (se < qs || ss > qe)
            return Integer.MAX_VALUE;
        int mid = getMid(ss, se);
        return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1),
                RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
    }
    int RMQ(int n, int qs, int qe)
    {	if(qs>qe) return RMQUtil(0, n - 1, qe, qs, 0);
 
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
  
   public static void main(String args[]) 
    {
        int arr[];
		Scanner l = new Scanner(System.in);
		PrintWriter std = new PrintWriter(System.out);
		int n = l.nextInt();
		arr = new int [n];
        SegmentTree tree = new SegmentTree();
		for(int i=0;i<n;i++)
			arr[i]=l.nextInt();
        tree.constructST(arr, n);
        int qs,qe;
		int f=l.nextInt();
		while(f-- !=0){
			qs=l.nextInt()-1;
			qe=l.nextInt()-1;
			std.println(tree.RMQ(n, qs, qe));
		}
        std.close();
    }
}