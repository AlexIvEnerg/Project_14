
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

        Integer[][] arr2d = {{1, 3, 5},{2, 4, 6}};
        Array2dIter<Integer> array2dIter = new Array2dIter<>(arr2d);
        for (Object integer : array2dIter) {
            System.out.println(integer);
        }
    }
}