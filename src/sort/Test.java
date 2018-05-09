package sort;

/**
 * Created by QIAOYIFAN on 2018/5/9.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = Utils.getIntArray();
        //String[] a ={"s","b","e","we","ad","aac","a"};

        //new SelectSort().select(a);
        //new InsertSort().Insertion(a);
        //new ShellSort().shell(a);
        new BubbleSort().bubble(a);
        for(Comparable i : a){
            System.out.println(i);
        }



    }
}
