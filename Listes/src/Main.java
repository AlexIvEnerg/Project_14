import java.util.ArrayList;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        int n = 1000000; int p = 1000;
        for (int i = 0; i < n; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        double exp = arrayList.get(1);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < p; i++) {
             exp = arrayList.get((int) (Math.random()*(n - 1)));
        }
        // exp = arrayList.get(1);
        System.out.println((System.currentTimeMillis() - startTime) +" , "+ exp );

        startTime = System.currentTimeMillis();
        for (int i = 0; i < p; i++) {
            exp = linkedList.get((int) (Math.random()*(n - 1)));
        }
        // exp = linkedList.get(1);
        System.out.println((System.currentTimeMillis() - startTime) +" , "+ exp);
    }
}

/*
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            "i = " + i); */