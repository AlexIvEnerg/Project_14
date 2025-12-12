
public class Box  {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width; this.height = height; this.depth = depth;
    }
    public void viewingOfBox() { System.out.println("Dimensions of box: " + width
    + ", "+ height +", "+ depth);
    }
}

class HeavyBox extends Box implements Comparable<HeavyBox> {
    int weight;
    HeavyBox(double width, double height, double depth) {
        super(width, height, depth);
    }
    public void setWeight (int weight) { this.weight = weight;}
    public int getWeight() { return this.weight; }
    @Override
    public int compareTo(HeavyBox heavyBox) { return weight - heavyBox.getWeight(); }
}