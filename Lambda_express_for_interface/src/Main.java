import java.util.Objects;
import java.util.function.Predicate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        String s = "Hello!";
        Printable printable = Printable::print;
        printable.method(s);

        Predicate<String> predicate1 = Objects::nonNull;
        System.out.println(predicate1.test(s));
        Predicate<String> predicate2 = t -> t.contains("H");
        System.out.println(predicate1.and(predicate2).test(s));

        s = "Java data";
        printable.method(s);
        Predicate<String> predicate3 = t -> t.contains("J");
        Predicate<String> predicate4 = t -> t.contains("N");
        Predicate<String> predicate5 = t -> t.contains("a");
        System.out.println(predicate3.or(predicate4).and(predicate5).test(s));
        /* for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        } */
    }
}