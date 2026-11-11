abstract class Outer8 {
    abstract class Inner {
        abstract void myAbstractMethod();
    }
}

class Derived8 extends Outer8 {
    class InnerImpl extends Inner {
        void myAbstractMethod() {
            System.out.println("Inside abstract method implementation");
        }
    }
}

class Main8 {
    public static void main(String[] args) {
        Derived8 outer = new Derived8();
        Derived8.Inner inner = outer.new InnerImpl();
        inner.myAbstractMethod();
    }
}