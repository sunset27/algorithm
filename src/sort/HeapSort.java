package sort;

public class HeapSort {
    public static void swim(Comparable[] a,int k){
        while (k>1&&Utils.less(a[k/2],a[k])){
            Utils.exch(a,k/2,k);
            k=k/2;
        }

    }
    public static void skin(Comparable[] a,int k,int N){
        while(2*k<=N){
            int j=2*k;
            if(j<N && Utils.less(a[j],a[j+1]))
                j++;
            if(!Utils.less(a[k],a[j]))
                break;
            Utils.exch(a,k,j);
            k=j;
        }
    }

    public void sort(Comparable[] a){
        a[0]=0;
        int N = a.length-1;
        for(int k=N/2;k>=1;k--)
            skin(a,k,N);
        while(N>1){
            Utils.exch(a,1,N--);
            skin(a,1,N);
        }
    }
}
