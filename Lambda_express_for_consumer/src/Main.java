import java.util.function.Consumer;
import java.util.function.Function;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        HeavyBox heavyBox = new HeavyBox();
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept(heavyBox.message1);
        Consumer<String> consumer2 = str -> System.out.println(str.toUpperCase());
        consumer2.accept(heavyBox.message2);
        consumer1.andThen(consumer2).accept(heavyBox.message1+" "+heavyBox.message2);

        Function<Integer,String> function = numb -> {
            if  (numb<0) return "Отрицательное число";
            else if (numb>0) return "Положительное число";
            else if (numb==0) return "Ноль";
            return "";
        };
        System.out.println('\n'+function.apply(10));
        System.out.println(function.apply(-5));
        System.out.println(function.apply(0));
        /*  “Отгрузили ящик с весом n”
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        } */
    }
}