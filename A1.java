class A1 {
    A1() {
        this(10);
        System.out.println("Default constructor");
    }

    A1(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new A1();
    }
}
