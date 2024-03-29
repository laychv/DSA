package com.laychv.leetcode;

/**
 * 69. x 的平方根 🟢
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * <p>
 * 输入：x = 4
 * 输出：2
 * <p>
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 * <p>
 * 提示：
 * 0 <= x <= 2^31 - 1
 * https://leetcode.cn/problems/sqrtx/
 */
public class _69_Sqrt {

    /**
     * binary search
     * [left,right]
     */
    static int mySqrt(int x) {
        if (x == 1 || x == 0) return x;
        int left = 0;
        int right = x;
        int res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int target = x / mid;
            if (mid == target) {
                return mid;
            } else if (mid < target) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    /**
     * binary search
     */
    static int mySqrt2(int x) {
        int l = 0, r = x, res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((long) m * m <= x) {
                l = m + 1;
                res = m;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    /**
     * brute force
     */
    static int mySqrt3(int x) {
        long a = 0;
        for (long i = 0; i * i <= x; i++) {
            a = i;
        }
        return (int)a;
    }
}
