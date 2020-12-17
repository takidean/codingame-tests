public class Runnables implements Runnable {

    public static void main(String args[]){

        Runnables runnables = new Runnables();
         Thread thread = new Thread(()->{});
        Thread thread1 = new Thread(runnables);
        Thread thread2 = new Thread(Runnables::run3);
        Thread thread3 = new Thread(runnables::run4);
        Thread thread4 = new Thread(runnables::run2);
        Thread thread5 = new Thread(runnables::run);
        Vehicule vv=  new Vehicule(5);
        Thread thread56 = new Thread(vv::demarrer);
        thread56.run();
       System.out.println( Vehicule.class.getClass().getFields().length);
        }

    @Override
    public void run() {

    }

    private void run2(){}

    public static void run3(){}

    public String run4(){return null;}

    public String run5(String params){return null;}

}
