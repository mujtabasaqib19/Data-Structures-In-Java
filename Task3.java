public class Task3 {
    static class Item {
        int age;
        double price;
        String name;

        Item(int age, double price, String name) {
            this.age = age;
            this.price = price;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Item{age=" + age + ", price=" + price + ", name='" + name + "'}";
        }
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(4, 15.99, "Shirt"),
                new Item(8, 9.99, "Pants"),
                new Item(6, 19.99, "Pants"),
                new Item(4, 7.49, "Pants"),
                new Item(8, 12.99, "Shirt"),
                new Item(2, 5.99, "Shirt"),
                new Item(6, 14.49, "Pants"),
                new Item(2, 8.99, "Pants"),
                new Item(10, 6.99, "Pants"),
                new Item(4, 10.99, "Shirt"),
        };

        bubbleSortItems(items);

        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println(item);
        }
    }

    static void bubbleSortItems(Item[] items) {
        boolean swapped;
        for (int i = 0; i < items.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < items.length - i - 1; j++) {
                if (shouldSwap(items[j], items[j + 1])) {
                    // Swap
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static boolean shouldSwap(Item item1, Item item2) {
        if (item1.age != item2.age) {
            return item1.age > item2.age;
        } else {
            return item1.price < item2.price;
        }
    }
}
