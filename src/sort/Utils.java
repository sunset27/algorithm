package sort;

import java.util.Comparator;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class Utils {
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static boolean less(Comparable i,Comparable j){
        return i.compareTo(j)<0;
    }
    public static Integer[] getIntArray(int arrayLength,int arrayNumRange){
        int n = (int)((Math.random()+1)*arrayLength);
        Integer[] arrays =new Integer[n];
        for (int i = 0; i <n ; i++) {
            arrays[i] = (int)(Math.random()*arrayNumRange);
        }
        return arrays;

    }
    public static Integer[] getIntArray(){
        return getIntArray(30,100);
    }
}
