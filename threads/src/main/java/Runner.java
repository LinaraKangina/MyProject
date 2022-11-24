// Способ 1
// public class Runner implements Runnable{
//
//    @Override
//    public void run () {
//        while(true){
//            System.out.println("A");
//        }
//    }
//}

//// Способ 2
//public class Runner extends Thread{
//
//    @Override
//    public void run () {
//        while(true){
//            System.out.println("A");
//        }
//    }
//}

// Способ 3

public class Runner implements Runnable{

    @Override
    public void run () {
        while(true){
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("A");
        }
    }
}