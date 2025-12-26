import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        HeavyBox[] boxes = new HeavyBox[4];
        boxes[0] = new HeavyBox(20.0, 10.0, 30.0);
        boxes[1] = new HeavyBox(20.0, 10.0,30.0);
        boxes[2] = new HeavyBox(20.0, 20.0, 30.0);
        boxes[3] = new HeavyBox(20.0, 20.0, 30.0);
        boxes[0].setWeight(2); boxes[1].setWeight(2);
        boxes[2].setWeight(4); boxes[3].setWeight(4);
        List<HeavyBox> boxesList = new ArrayList<>(Arrays.asList(boxes));
        for (HeavyBox box : boxesList ) {
            box.viewingOfBox();
            int index = boxesList.indexOf(box);
            System.out.println("Weight Of Box"+ index +": "+ box.getWeight());
            System.out.println('\n'); }
        HeavyBox boxShift = new HeavyBox(20.0, 10.0, 30.0);
        boxShift.setWeight(1);  boxesList.set(0, boxShift);
        boxesList.remove(3);

        Object[] objectArray = boxesList.toArray();
        for (Object box : objectArray) {
            System.out.println(box);
            System.out.println('\n');
        }
        HeavyBox[] heavyBoxArray = new HeavyBox[boxesList.size()];
        boxesList.toArray(heavyBoxArray);
        for (HeavyBox box : heavyBoxArray) {
            box.viewingOfBox();
            int index = boxesList.indexOf(box);
            System.out.println("Weight Of Box"+ index +": "+ box.getWeight());
            System.out.println('\n');
        }
        List<HeavyBox> removeBox;  removeBox = boxesList;
        boxesList.removeAll(removeBox) ;

        TreeSet<HeavyBox> treeSet = new TreeSet<>(Arrays.asList(heavyBoxArray));

        for (HeavyBox box : treeSet) {
            box.viewingOfBox();
            System.out.println("Weight Of Box: "+ box.getWeight());
        }

        SetOfNumbers setOfNumbers = new SetOfNumbers();
        setOfNumbers.printSetToNumbers(setOfNumbers.withoutToRepeatsOfNumb(setOfNumbers.set));

        ArrayDeque<HeavyBox> boxQueue = new ArrayDeque<>();
        int numb = 0;
        while (numb < boxes.length) {
            boxQueue.offer(boxes[numb]);
            numb++;
        }
        for (HeavyBox box : boxQueue) { box.viewingOfBox(); }
        for (int l = boxQueue.size(); l>0 ;l--) {
            boxQueue.poll();
        }
        System.out.println();

        ArrayList<Box> boxList = new ArrayList<>();
        boxList.add(new Box(20.0, 10.0, 30.0));
        boxList.add(new Box(20.0, 20.0, 30.0));
        boxList.add(new Box(40.0, 10.0, 30.0));
        boxList.add(new Box(40.0, 20.0, 30.0));

        ArrayList<Box> boxList2 = new ArrayList<>();
        iterBox(boxList, boxList2);
        System.out.println("boxList");
        for (Box box : boxList) { box.viewingOfBox(); }
        System.out.println("boxList2");
        for (Box box : boxList2) { box.viewingOfBox(); }
    }

    public static void iterBox(ArrayList<Box> list1, ArrayList<Box> list2) {
        int i = 0;
        for (Box box : list1) {
            if(box.width > 30.0) {
                list2.add(i,box);
                i++;
            }
        }
        list1.removeIf(box -> box.width > 30.0);
    }
}