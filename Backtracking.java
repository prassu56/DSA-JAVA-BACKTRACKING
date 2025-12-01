public class Backtracking {
    public static void random(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        random(n - 1, ans + "1"); // removed space
        random(n - 1, ans + "0"); // removed space
    }

    public static void main(String[] args) {
        random(3, "");
    }
}
