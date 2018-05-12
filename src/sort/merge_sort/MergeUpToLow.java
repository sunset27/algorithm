package sort.merge_sort;

import sort.InsertSort;
import sort.SelectSort;
import sort.Utils;

public class MergeUpToLow {
    private Comparable[] aux;
    public void sort(Comparable[] a){
        int n =a.length;
        aux = new Comparable[n];
        sort(a,0,n-1);

    }
    public void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi) return;
//        if(lo+5>=hi){
//            new SelectSort().sort(a,lo,hi);
//            return;
//        }
        int mid = lo+(hi-lo)/2;
        sort(a,lo,mid);//左半边排序
        sort(a,mid+1,hi);//右半边排序
        mergeSort(a,lo,mid,hi);
    }
    public void mergeSort(Comparable[] a,int l,int mid,int hi){
        int i = l,j= mid+1;
        //Comparable[] hux = new Comparable[hi];
        //不能在这里定义辅助数组，如果定义则每次调用方法都会创建一个数组，影响空间复杂度
        for (int k = l; k <=hi ; k++) {
            aux[k]=a[k];
        }
        for(int k= l;k<=hi;k++){
            if(i>mid)
                a[k]=aux[j++];
            else if(j>hi)
                a[k]=aux[i++];
            else if(Utils.less(aux[j],aux[i]))
                a[k]=aux[j++];
            else
                a[k]=aux[i++];
        }
    }
}
