package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class SelectSort {
    public void sort(Comparable[] a){
//        for(int i = 0;i<a.length;i++){
//            int min = i;
//            for(int j=i+1;j<a.length;j++){
//                if(Utils.less(a[j],a[min]))
//                    min = j;
//
//            }
//            Utils.exch(a,i,min);
//        }
        sort(a,0,a.length);
    }
    public void sort(Comparable[] a,int lo,int hi){
        for(int i=lo;i<hi;i++){
            int min = i;
            for(int j=i+1;j<hi;j++){
                if(Utils.less(a[j],a[min]))
                    min = j;
                //

            }
            Utils.exch(a,i,min);
        }
    }
}

//
//
