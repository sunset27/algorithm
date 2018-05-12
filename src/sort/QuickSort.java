package sort;

public class QuickSort {
    public void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    public void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi) return;
//        if(lo+5>hi){
//            new InsertSort().sort(a,lo,hi);
////            return;
//        }
        int v = partition(a,lo,hi);
        sort(a,lo,v-1);
        sort(a,v+1,hi);

    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i=lo,j=hi+1;
        Comparable v =a[lo];
        while (true){
            while(Utils.less(a[++i],v))
                if (i==hi)
                    break;
            while (Utils.less(v,a[--j]))
                if(j==lo)
                    break;
            if(i>=j)
                break;
            Utils.exch(a,i,j);
        }
        Utils.exch(a,lo,j);
        return j;
    }
}
