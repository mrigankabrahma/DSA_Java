package lecture7;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=99;
    }

}
