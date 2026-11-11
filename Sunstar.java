abstract class Sunstar {
    abstract void printInfo();
}

class Employee extends Sunstar {
    @Override
    void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

public class Base {
    public static void main(String[] args) {
        Sunstar s = new Employee();
        s.printInfo();
    }
}