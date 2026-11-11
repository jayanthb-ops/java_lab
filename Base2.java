abstract class Base4 {
    Base4() {
        System.out.println("Base Constructor Called");
    }

    abstract void fun();
}

class Derived4 extends Base4 {
    Derived4() {
        System.out.println("Derived Constructor Called");
    }

    void fun() {
        System.out.println("Derived fun() called");
    }
}

class Main4 {
    public static void main(String[] args) {
        Derived4 d = new Derived4();
        d.fun();
    }
}