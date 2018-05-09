package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class SelectSort {
    public void select(Comparable[] a){
        for(int i = 0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(Utils.less(a[j],a[min]))
                    min = j;

            }
            Utils.exch(a,i,min);
        }
    }
}
