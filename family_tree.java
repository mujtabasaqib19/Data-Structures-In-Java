import java.util.ArrayList;
import java.util.List;
public class family_tree {
    private int[] wealth;

    public family_tree() {
        wealth = new int[]{50000, 25000, 30000, 10000, 15000, 20000, 10000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
    }
    public int totalWealth() {
        int total = 0;
        for (int w : wealth) {
            total += w;
        }
        return total;
    }
    public int max_wealth() {
        int max = wealth[0];
        for (int w : wealth) {
            if (w > max) {
                max = w;
            }
        }
        return max;
    }
    public int min_wealth() {
        int min = wealth[0];
        for (int i = 0; i < wealth.length; i++) {
            int w = wealth[i];
            if (w < min) {
                min = w;
            }
        }
        return min;
    }
    public List<Double> avg_wealth() {
        List<Double> averages = new ArrayList<>();
        int levelStart = 0;
        int levelEnd = 1;

        while (levelStart < wealth.length) {
            int sum = 0;
            int count = 0;
            for (int i = levelStart; i < levelEnd && i < wealth.length; i++) {
                sum += wealth[i];
                count++;
            }
            averages.add(sum / (double) count);
            levelStart = levelEnd;
            levelEnd = levelEnd * 2 + levelStart;
        }

        return averages;
    }

    public static void main(String[] args) {
        family_tree tree = new family_tree();
        System.out.println("total wealth " +tree.totalWealth());
        System.out.println("maximum wealth " +tree.max_wealth());
        System.out.println("minimum wealth " +tree.min_wealth());

        List<Double> averages = tree.avg_wealth();
        System.out.println("average wealth per level ");
        for (int i = 0; i < averages.size(); i++) {
            System.out.println("level " +(i+1) +" " +averages.get(i));
        }
    }
}
