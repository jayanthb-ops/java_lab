class GarbageDemo {
    protected void finalize() {
        System.out.println("Object destroyed");
    }

    public static void main(String[] args) {
        GarbageDemo obj = new GarbageDemo();

        System.out.println(obj);
        obj = null;

        System.gc();

        System.out.println("End of program");
    }
}
