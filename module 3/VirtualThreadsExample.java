public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread"));
        }
        Thread.sleep(1000);
    }
}