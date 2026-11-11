abstract class Base5 {
    void fun() {
        System.out.println("Function of Base class is called");
    }
}

class Derived5 extends Base5 {
}

class Main5 {
    public static void main(String[] args) {
        Derived5 d = new Derived5();
        d.fun();
    }
}
