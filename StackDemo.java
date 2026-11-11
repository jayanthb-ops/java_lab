class StackDemo {
    int stack[] = new int[5];
    int top = -1;

    void push(int x) {
        if (top == 4)
            System.out.println("Stack Overflow");
        else
            stack[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();
        s.pop();
    }
}
