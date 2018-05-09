package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class InsertSort {
    public void Insertion(Comparable[] a){
        for (int i = 1; i <a.length ; i++) {
            for(int j=i;j>0&&Utils.less(a[j],a[j-1]);j--)
                Utils.exch(a,j,j-1);


        }
    }
}
