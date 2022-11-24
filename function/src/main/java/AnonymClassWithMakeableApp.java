public class AnonymClassWithMakeableApp {
    public static void main (String [] args){
        Makeable maker = new Makeable() {
            @Override
            public void make (){
                System.out.println("Making something");
            }
        };
        maker.make();
    }
}
