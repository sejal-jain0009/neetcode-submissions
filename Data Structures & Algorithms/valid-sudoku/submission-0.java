class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                char num = board[row][col];

                if (num == '.')
                    continue;

                String r = num + " in row " + row;
                String c = num + " in col " + col;
                String b = num + " in box " + (row / 3 * 3 + col / 3);

                if (!seen.add(r) || !seen.add(c) || !seen.add(b))
                    return false;
            }
        }

        return true;
    }
}