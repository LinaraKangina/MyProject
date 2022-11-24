import javax.swing.table.AbstractTableModel;

public class AnonymClassApp {
    public static void main (String [] args){

        AbstractUser user = new AbstractUser(){
            @Override
            void doSomething(){
                System.out.println("Doing something");
            }
        };
        user.doSomething();
    }
}