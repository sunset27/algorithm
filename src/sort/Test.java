package sort;

import sort.merge_sort.MergeLowToUp;
import sort.merge_sort.MergeUpToLow;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = Utils.getIntArray();
        //String[] a ={"s","b","e","we","ad","aac","a"};

//        new SelectSort().sort(a);
        //new InsertSort().sort(a);
        //new ShellSort().shell(a);
        //new BubbleSort().bubble(a);
//        new MergeUpToLow().sort(a);
        //new MergeLowToUp().sort(a);
        new QuickSort().sort(a);
        for(Comparable i : a){
            System.out.print(i+" ");

        }
        System.out.println(Utils.isSort(a));



    }
}
