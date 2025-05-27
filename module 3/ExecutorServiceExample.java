import java.util.concurrent.*;
import java.util.*;
public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = List.of(
            () -> "Task1", () -> "Task2", () -> "Task3"
        );
        List<Future<String>> results = service.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        service.shutdown();
    }
}