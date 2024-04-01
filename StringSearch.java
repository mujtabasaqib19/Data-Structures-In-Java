import java.util.Arrays;
public class StringSearch {

    static boolean Search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String name = "Mujtaba";
        char target = 'b';
        System.out.println(Search(name, target));

    }
}