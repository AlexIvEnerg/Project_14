
//import java.util.ArrayI//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        Integer[] arr = {1, 2, 5, 4};

        ArrayIter<Integer> arrayIter = new ArrayIter<>(arr);

        for (Object integer : arrayIter) {
            System.out.println(integer);
        }

    }
}