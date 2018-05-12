package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class InsertSort {
    public void sort(Comparable[] a){
//        for (int i = 1; i <a.length ; i++) {
//            for(int j=i;j>0&&Utils.less(a[j],a[j-1]);j--)
//                Utils.exch(a,j,j-1);
        sort(a,0,a.length);
    }
    public void sort(Comparable[] a,int lo,int hi){
        for(int i =lo+1;i<hi;i++){
            for (int j = i; j > 0&&Utils.less(a[j],a[j-1]) ; j--) {
                Utils.exch(a,j,j-1);

            }
        }
    }


}
