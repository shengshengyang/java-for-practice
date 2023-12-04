package thread.consumer1;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <a href="https://shengshengyang.github.io/2023/12/04/java-threads-consumer/">explain is here, click me</a>
 */
public class Main {
    private static Buffer buffer = new Buffer();

    private static class Buffer {
        private static final int CAPACITY = 1;
        private LinkedList<Integer> queue = new LinkedList<>();
        private static Lock lock = new ReentrantLock();
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        public void write(int value) {
            lock.lock();
            try {
                // 當緩衝區滿時，生產者等待
                while (queue.size() == CAPACITY) {
                    notFull.await();
                }
                // 寫入數據到緩衝區
                queue.offer(value);
                // 喚醒等待中的消費者
                notEmpty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public int read() {
            lock.lock();
            int value = 0;
            try {
                // 當緩衝區為空時，消費者等待
                while (queue.isEmpty()) {
                    notEmpty.await();
                }
                // 從緩衝區讀取數據
                value = queue.remove();
                // 喚醒等待中的生產者
                notFull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                return value;
            }
        }
    }

    private static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    // 消費者從緩衝區讀取數據
                    System.out.println("Consumer reads " + buffer.read());
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                int i = 0;
                while (true) {
                    // 生產者將數據寫入緩衝區
                    System.out.println("Producer writes " + i);
                    buffer.write(i++);
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 使用固定大小的線程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 同時運行生產者和消費者
        executorService.execute(new Producer());
        executorService.execute(new Consumer());
        // 關閉線程池
        executorService.shutdown();
    }
}
