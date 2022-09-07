import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};
        System.out.println(equal(a,b));
    }
    static int[] reverse (int[] a)
    {
        int[] reverse = new int[a.length];
        int i = a.length;
        for(int v : a)
        {
            reverse[i-1] = v;
            i = i - 1;
        }
        return reverse;
    }
    static boolean equal (int[] a, int[] b)
    {
        if(a.length == b.length)
        {
            for(int i = 0; i < a.length; i = i + 1)
            {
                if (a[i] != b[i])
                    return false;
            }
            return true;
        }
        return false;
    }
}