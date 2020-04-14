package com.wxz.controller;

public class text {
    public  int IndexOf(char[] w,char[] str){
        if (w == null || str == null || w.length == 0 || str.length == 0)
            return -1;

        int i, j;
        for (i = 0; i < w.length; i++)
        {
            if (w[i] == str[0])
            {
                for (j = 1; j < str.length; j++)
                {
                    if (w[i + j] != str[j])
                        break;
                }
                if (j == str.length)
                    return i;
            }
        }
        return -1;
    }
    public static boolean  findNumberIn2DArray(int target, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[i].length - 1;
            while (low <= high) {
                int mid = (low + high)/2;
                if (target >  matrix[i][mid]) {
                    low = mid + 1;
                } else if (target < matrix[i][mid]) {
                    low = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {


    }
}
