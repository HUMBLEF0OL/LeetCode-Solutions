class Solution {
    public boolean finder(int i,int j,String word,char board[][])
    {
        if(word.length() == 0)return true;
        if(i <0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(0))return false;
        
        board[i][j] = '*';
        // searching in all the required direction
        char c = word.charAt(0);
        word = word.substring(1);
        boolean top = finder(i+1,j,word,board);
        boolean bottom = finder(i-1,j,word,board);
        boolean left = finder(i,j-1,word,board);
        boolean right = finder(i,j+1,word,board);
        
        //repairing the updated word
        board[i][j] = c;
        return top || bottom || left || right;
    }
    public boolean exist(char[][] board, String word) {
        char c = word.charAt(0);
        for(int i =0;i<board.length;i++)
        {
            for(int j =0;j<board[0].length;j++)
            {
                if(board[i][j] == c)
                {
                    if(finder(i,j,word,board))return true;
                }
            }
        }
        return false;
    }
}