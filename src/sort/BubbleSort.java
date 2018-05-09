package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 * 冒泡排序
 */

public class BubbleSort {
    public void bubble (Comparable[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if(Utils.less(a[j+1],a[j]))
                    Utils.exch(a,j,j+1);

            }

        }
    }
}
