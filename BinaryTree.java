//Q4 22K-4005 MUJTABA SAQIB
import java.util.ArrayList;
import java.util.List;
public class BinaryTree {
    static int[] tree = new int[10];
    static List<nodes>[] nodesByColumn;
    static int minColumn = 0;
    static int maxColumn = 0;

    static {
        for (int i = 0; i < tree.length; i++) {
            tree[i] = -1;
        }
        nodesByColumn = new ArrayList[20];
        for (int i = 0; i < nodesByColumn.length; i++) {
            nodesByColumn[i] = new ArrayList<>();
        }
    }

    static void traverse(int index, int row, int col) {
        if (index >= tree.length || tree[index] == -1) return;

        minColumn = Math.min(minColumn, col);
        maxColumn = Math.max(maxColumn, col);
        nodesByColumn[col - minColumn].add(new nodes(tree[index], row, col));
        traverse(index * 2 + 1, row + 1, col - 1);
        traverse(index * 2 + 2, row + 1, col + 1);
    }

    static List<List<Integer>> verticalOrder() {
        traverse(0, 0, 0);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = minColumn; i <= maxColumn; i++) {
            List<Integer> columnValues = new ArrayList<>();
            for (nodes node : nodesByColumn[i - minColumn]) columnValues.add(node.value);
            result.add(columnValues);
        }
        return result;
    }

    public static void main(String[] args) {
        root(3);
        setLeft(9, 0);
        setRight(20, 0);
        setLeft(15, 2);
        setRight(7, 2);
        printTree();
        System.out.println("\n");
        List<List<Integer>> order = verticalOrder();
        for (int i = 0; i < order.size(); i++) {
            List<Integer> col = order.get(i);
            System.out.println(col);
        }
    }
    static int root(int key) {
        if (tree[0] != -1)
            System.out.println("tree already had root");
        else
            tree[0] = key;
        return 0;
    }

    static int setLeft(int key, int parent) {
        if (tree[parent] == -1)
            System.out.println("\ncan't set child at " +((parent * 2) + 1)+",no parent found");
        else
            tree[(parent * 2) + 1] = key;
        return 0;
    }

    static int setRight(int key, int parent) {
        if (tree[parent] == -1)
            System.out.println("\ncan't set child at " +((parent * 2) + 2)+ ",no parent found");
        else
            tree[(parent * 2) + 2] = key;
        return 0;
    }

    static int printTree() {
        for (int i = 0; i < 10; i++) {
            if (tree[i] != -1)
                System.out.print(tree[i] + " ");
            else
                System.out.print("- ");
        }
        return 0;
    }
}
class nodes {
    int value;
    int row;
    int col;

    nodes(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}
