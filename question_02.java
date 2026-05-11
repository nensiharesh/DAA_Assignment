// Q2: Coin Change Problem — Pakistani Currency
// Greedy approach, minimum denomination = Rs. 1

public class question_02{

    static void coinChange(int amount) {
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("  Q2: COIN CHANGE — PAKISTANI CURRENCY");
        System.out.println("\n  Target Amount: Rs. " + amount);
        System.out.println("  " + "-".repeat(44));

        int remaining = amount;
        for (int denom : denominations) {
            if (remaining >= denom) {
                int count = remaining / denom;
                remaining -= count * denom;
                String label = denom >= 10 ? "note" : "coin";
                System.out.printf("  Rs. %5d %-4s  x %d%n", denom, label, count);
            }
        }
        System.out.println("  " + "-".repeat(44));
        System.out.println("  Remaining: Rs. " + remaining);
        System.out.println("\n[Q2 complete]");
    }

    public static void main(String[] args) {
        coinChange(1988);
    }
}