class ReturnObject {
    int x;

    ReturnObject(int x) {
        this.x = x;
    }

    ReturnObject add(ReturnObject obj) {
        ReturnObject temp = new ReturnObject(this.x + obj.x);
        return temp;
    }

    public static void main(String[] args) {
        ReturnObject a = new ReturnObject(10);
        ReturnObject b = new ReturnObject(20);

        ReturnObject c = a.add(b);

        System.out.println("Sum = " + c.x);
    }
}