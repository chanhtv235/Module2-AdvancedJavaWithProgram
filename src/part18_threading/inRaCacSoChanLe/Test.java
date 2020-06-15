package part18_threading.inRaCacSoChanLe;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread=new OddThread();
        EvenThread evenThread=new EvenThread();
        evenThread.start();
        evenThread.join();
        oddThread.start();

    }
}
