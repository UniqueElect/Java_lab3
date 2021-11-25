package Task4;

public class LowLevel {
    public static void main(String[] args) {
        final Thread1 thread1 = new Thread1();
        final Thread2 thread2 = new Thread2();
        final Thread3 thread3 = new Thread3();
        final Thread4 thread4 = new Thread4();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            Calculations.increment(3,2);
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            Calculations.decrement(15,12);
        }
    }

    public static class Thread3 extends Thread{
        @Override
        public void run() {
            Calculations.multi(11,23);
        }
    }

    public static class Thread4 extends Thread{
        @Override
        public void run() {
            Calculations.division(21,6);
        }
    }
}