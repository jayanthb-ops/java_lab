public class BoxConstructer {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    BoxConstructer(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        // declare, allocate, and initialize BoxConstructer objects
        BoxConstructer mybox1 = new BoxConstructer(10, 20, 15);
        BoxConstructer mybox2 = new BoxConstructer(3, 6, 9);
        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
