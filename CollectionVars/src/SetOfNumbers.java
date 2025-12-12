import java.util.*;

public class SetOfNumbers {
    Integer[] set = new Integer[8];

    SetOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку чисел (ок. 8): ");
        int currNumb = 0 ;
        while (currNumb<set.length) {
            if (scanner.hasNextInt()) {
                this.set[currNumb] = scanner.nextInt();
            }
            currNumb++;
        }
    }

    public Set<Integer> withoutToRepeatsOfNumb(Integer[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    public void printSetToNumbers(Set<Integer> set) {
        System.out.println(set);
    }
}
