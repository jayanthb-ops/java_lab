class PrivateDemo {
    private int x;

    void setX(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }

    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();

        obj.setX(10);

        System.out.println("x = " + obj.getX());
    }
}
