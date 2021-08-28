package BackTracking;

public class WordSearch {
    public static boolean chk;
    public static void recur(char[][] board, String word, int i, int j, int k)
    {
        if(k == word.length())
        {
            chk = true;
            return;
        }
        if(i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] == '~')
            return;

        if(board[i][j] == word.charAt(k))
        {
            char c = board[i][j];
            board[i][j] = '~';
            recur(board, word, i, j+1, k+1);
            recur(board, word, i+1, j, k+1);
            recur(board, word, i, j-1, k+1);
            recur(board, word, i-1, j, k+1);
            board[i][j] = c;
        }
    }

    public static boolean wordSearch(char[][] board, String word)
    {
        chk  = false;
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j]==word.charAt(0))
                    recur(board, word, i, j, 0);
            }
        }

        return chk;
    }
}
