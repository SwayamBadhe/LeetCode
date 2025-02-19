class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;

        while (l < r) {
            int shorterHeight = Math.min(height[l], height[r]);
            area = Math.max((r - l) * shorterHeight, area);
            if (height[l] < height[r]) { l++; }
            else { r--; } 
        }

        return area;
    }
}