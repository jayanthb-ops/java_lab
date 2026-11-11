class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    void display() {
        System.out.println("This is the Animal class");
    }
}

class Dog extends Animal {
    Dog() {
        super(); 
        System.out.println("Dog constructor");
    }

    void display() {
        super.display(); 
        System.out.println("This is the Dog class");
    }
}

class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
//superkeyword
