public class Application {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runner());
        thread.start();
        Thread.sleep(2000);
        System.out.println("B");

    }

    // public static void main (String [] args){

        // способ 1 Runnable runner = new Runner();
        // способ 2
        // Runner runner = new Runner();
        // Thread thread = new Thread(runner);
        // thread.start();

//        System.out.println("B");

        // способ 3


//        while (true){
//            System.out.println("B");
//        }
//    }
}
