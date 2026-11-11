abstract class Base6 {
    final void fun() {
        System.out.println("Base fun() called");
    }
}

class Derived6 extends Base6 {
}

class Main6 {
    public static void main(String[] args) {
        Base6 b = new Derived6();
        b.fun();
    }
}
