package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class ShellSort {
    public void shell(Comparable[] a){
        int gap = 1;
        int n = a.length;
        while(gap<n/3){
            gap = gap*3+1;
        }
        while(gap>=1)
        {
            for (int i = 1; i <n ; i++) {
                for (int j = i; j >=gap&&Utils.less(a[j],a[j-gap]) ;j=j-gap) {
                    Utils.exch(a,j,j-gap);
                }

            }
            gap=gap/3;
        }
    }
}
