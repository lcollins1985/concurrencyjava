class Main extends Thread {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        t1.setPriority(MAX_PRIORITY);
        for (int cD = 20; cD>=0; cD--) {
            System.out.println(cD);
        }
        SecondThread t2 = new SecondThread();
        t2.start();
    }
}
class SecondThread extends Thread {
    @Override
    public void run() {
        for (int cU = 0; cU <= 20; cU++) {
            System.out.println(cU);
        }
    }
}