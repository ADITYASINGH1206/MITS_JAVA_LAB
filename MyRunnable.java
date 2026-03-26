class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}