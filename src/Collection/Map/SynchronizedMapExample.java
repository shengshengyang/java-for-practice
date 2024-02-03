package Collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) throws InterruptedException {
        // 這邊是HashMap 展現非同步
        Map<Integer, String> map = new HashMap<>();

        Thread mapThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread 1: " + i);
            }
        });

        Thread mapThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread 2: " + i);
            }
        });

        mapThread1.start();
        mapThread2.start();

        mapThread1.join();
        mapThread2.join();

        System.out.println("HashMap size is: " + map.size());



        // 使用 synchronizedMap ，數量固定為1000
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedMap.put(i, "Thread 1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedMap.put(i, "Thread 2: " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("synchronizedMap size is " + synchronizedMap.size());

        synchronized (synchronizedMap) {
            for (Map.Entry<Integer, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}

