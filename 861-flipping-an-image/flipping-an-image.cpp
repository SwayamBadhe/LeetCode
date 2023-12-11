class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        for (vector<int>& imageRow : image) {
            reverse(imageRow.begin(), imageRow.end());
            for (int& cell: imageRow) {
                cell = cell == 1 ? 0 : 1;
            }
        }
        return image;
    }
};