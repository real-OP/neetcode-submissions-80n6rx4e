class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet [] rows = new HashSet[9];
        HashSet [] cols = new HashSet[9];
        HashSet [] boxes = new HashSet[9];

        for(int i=0; i< 9 ; i++ ){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();

        }

        for(int row = 0; row < 9 ; row++ ){
            for(int col = 0; col < 9 ; col++ ){

                if(board[row][col] == '.') continue;

                char val = board[row][col];
                int boxindex = (row/3)*3 + (col/3);

                if(rows[row].contains(val))return false;
                if(cols[col].contains(val))return false;
                if(boxes[boxindex].contains(val))return false;

                rows[row].add(val);
                cols[col].add(val);
                boxes[boxindex].add(val);

            }
        }
        return true;
    }
}
