package Exception;

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}


public class ChainExcDemo {
    /*static  void demoproc(){
        NullPointerException e=new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }*/

    public static void main(String[] args) {
        try {
            try {
                throw new Sneeze();
            }
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }


}
