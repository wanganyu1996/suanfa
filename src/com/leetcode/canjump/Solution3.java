package com.leetcode.canjump;

class Solution3 {
    public boolean canJump(int A[], int n) {
        int f[]=new int[n];
        f[0]=-1;
        f[0] = 0;
        for (int i = 1; i < n; i++) {
            f[i] = Math.max(f[i - 1], A[i - 1]) - 1;
            if (f[i] < 0) return false;
        }
        return f[n - 1] >= 0;
    }
}

