package sort.merge_sort;

import sort.Utils;

public class MergeLowToUp {
    private Comparable[] aux;

    public void sort(Comparable[] a) {
        int n = a.length;
        aux = new Comparable[n];
        for(int gap =1;gap<n;gap+=gap){
            for(int lo =0;lo<n-gap;lo+=gap+gap){
                mergeSort(a,lo,lo+gap-1,Math.min(lo+gap+gap-1,n-1));
            }
        }


    }


    public void mergeSort(Comparable[] a, int l, int mid, int hi) {
        int i = l, j = mid + 1;
        //Comparable[] hux = new Comparable[hi];
        //不能在这里定义辅助数组，如果定义则每次调用方法都会创建一个数组，影响空间复杂度
        for (int k = l; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = l; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (Utils.less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
}