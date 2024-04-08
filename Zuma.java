//Q2 22K-4005 MUJTABA SAQIB
public class Zuma {
    public int findMin(String board, String hand) {
        int[] count = new int[30];
        char[] arr1 = hand.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            char c = arr1[i];
            count[c - 'A']++;
        }
        int result = backtrack(board + "#", count);
        if (result == Integer.MAX_VALUE) return -1;
        return result;
    }

    public int backtrack(String board, int[] count) {
        board = remove_consecutive(board);
        if (board.equals("#")) return 0;
        int result = Integer.MAX_VALUE, i = 0;
        for (int j = 1; j <= board.length(); ++j) {
            if (j == board.length() || board.charAt(j) != board.charAt(i)) {
                if (board.charAt(i) == '#') continue;
                int need = 3 - (j - i);
                if (count[board.charAt(i) - 'A'] >= need) {
                    count[board.charAt(i) - 'A'] -= need;
                    int nextResult = backtrack(board.substring(0, i) + board.substring(j), count);
                    if (nextResult != Integer.MAX_VALUE) {
                        result = Math.min(result, need + nextResult);
                    }
                    count[board.charAt(i) - 'A'] += need;
                }
                i = j;
            }
        }
        return result;
    }
    private String remove_consecutive(String board) {
        for (int i = 0, j = 0; j <= board.length(); j++) {
            if (j < board.length() && board.charAt(i) == board.charAt(j)) continue;
            if (j - i >= 3) {
                return remove_consecutive(board.substring(0, i) + board.substring(j));
            } else {
                i = j;
            }
        }
        return board;
    }
    public static void main(String[] args) {
        Zuma game = new Zuma();
        System.out.println(game.findMin("WRRBBW", "RB"));
    }
}
