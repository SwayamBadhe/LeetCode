class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;

        while (l < r) {
            int hl = height[l], hr = height[r];
            int shorterHeight = Math.min(hl, hr);
            area = Math.max((r - l) * shorterHeight, area);
            if (hl < hr) { l++; }
            else { r--; } 
        }

        return area;
    }
}