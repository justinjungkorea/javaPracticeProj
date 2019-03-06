package w3Package;

import java.util.Arrays;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.min;

public class Homework0305 {
    public static void main(String[] args) {
        //28에서 가장 가까운 수 찾기
        int[] ar = {10, 30, 27, 34, 41};
        int ans = abs(ar[0] - 28);
        int idx = 0;
        for (int i = 1; i < ar.length; ++i) {
            if(ans > abs(ar[i]-28)){
                idx = i;
                ans = abs(ar[i]-28);
            }
        }
        System.out.println(ar[idx]);

    }
}
