public class HelloWorldPrinter {
    public static void printHelloWorld(int n) {
        if (n > 0) {
            printHelloWorld(n - 1);
            System.out.println("Hello World " +n);
        }
    }

    public static void main(String[] args) {
        int n = 5; // You can change the value of n as needed
        printHelloWorld(n);
    }
}
