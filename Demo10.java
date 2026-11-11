abstract class Demo10 {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild10 extends Demo10 {
    public void m1() {
        System.out.println("Inside m1");
    }
}

class SecondChild10 extends FirstChild10 {
    public void m2() {
        System.out.println("Inside m2");
    }

    public void m3() {
        System.out.println("Inside m3");
    }
}

class Main10 {
    public static void main(String[] args) {
        SecondChild10 s = new SecondChild10();

        s.m1();
        s.m2();
        s.m3();
    }
}
