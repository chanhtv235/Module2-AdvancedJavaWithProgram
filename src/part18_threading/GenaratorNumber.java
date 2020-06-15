package part18_threading;

public class GenaratorNumber implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread thread1=new Thread(new GenaratorNumber());
        Thread thread2=new Thread(new GenaratorNumber());
        thread1.start();
        thread2.start();
    }
}
