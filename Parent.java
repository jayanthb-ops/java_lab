class Parent {
    private void display() {
        System.out.println("Private method of Parent class");
    }

    public void show() {
        display();
    }
}

class Child extends Parent {
    void access() {
        show();
    }
}

class PrivateMethodDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.access();
    }
}
//private method access
