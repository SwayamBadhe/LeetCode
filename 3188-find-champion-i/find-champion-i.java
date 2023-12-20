class Solution {
    public int findChampion(int[][] grid) {
        int champ = 0;
        for (int opp=0; opp!=grid.length; opp++) {
            if (opp == champ) {
                continue;
            }
            if (grid[champ][opp] == 0) {
                champ = opp;
            }
        }
        return champ;
    }
}