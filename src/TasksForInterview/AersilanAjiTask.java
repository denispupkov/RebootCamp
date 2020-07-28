package TasksForInterview;
/*
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class AersilanAjiTask {
    static int solution(int[] a) {
        int temp = 0;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    check = true;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        if(a[a.length-1]<0) {
            return 1;
        }
        for (int i = 0; i < a.length-1; i++) {
            if (a[i + 1] - a[i] <2) {
                continue;
            } else {
                return a[i]+1;
            }
        }
        return a[a.length - 1] + 1;
    }
    public static void main(String[] args) {
        int [] nums = new int[]{1,3,6,4,1,2};
        System.out.println(solution(nums));
    }
}