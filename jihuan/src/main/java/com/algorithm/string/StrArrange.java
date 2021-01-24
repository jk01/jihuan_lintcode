package com.algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrArrange {
    public List<String> stringPermutation2(String str) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        char[] s = str.toCharArray();
        Arrays.sort(s);
        result.add(String.valueOf(s));
        while ((s = nextPermutation(s)) != null) {
            result.add(String.valueOf(s));
        }
        return result;
    }

    public char[] nextPermutation(char[] nums) {
        int index = -1;
        for(int i = nums.length -1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index == -1){
            return null;
        }
        for(int i = nums.length -1; i > index; i--){
            if(nums[i] > nums[index]){
                char temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
        System.out.println(String.valueOf(nums));
        return nums;

    }

    public void reverse(char[] num, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }

    public static void main(String[] args) {
        StrArrange strArrange = new StrArrange();
        List<String> res = strArrange.stringPermutation2("abc");
        for(String ss : res){
            System.out.print(ss+",");
        }
        System.out.println();
    }
}
