
public class permutation {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean board[] = new boolean[n];
        permutations(board, tq, 0, "");
    }

    public static void permutations(boolean board[], int tq, int qpsf, String ans) {
        // BASE CASE//
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                permutations(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i] = false;// undo ...backtracked
            }
        }
    }
}
