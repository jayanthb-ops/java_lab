abstract class Demo9 {
    abstract void m1();
}

class Child9 extends Demo9 {
    public void m1() {
        System.out.println("Hello");
    }
}

class Main9 {
    public static void main(String[] args) {
        Child9 c = new Child9();
        c.m1();
    }
}
