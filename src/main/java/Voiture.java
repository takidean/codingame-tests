public class Voiture extends Vehicule implements  Machine{
    int a;

    public int getA() {
        return a;
    }

    static int b=13;
    public Voiture(int a) {
        super(a);
        this.a=a;
    }

    public Boolean isAVoiture(Voiture v){
        return v.getA()==12 ?  true:false;
    }
    void demarrer(){
        super.demarrer();
        System.out.println("voiture "+a);
    }

    void marche(){
        System.out.println("voiture en marche "+b);
    }


    @Override
    public Boolean isMachine(Vehicule m) {
        return m.a==12 ? true:false;
    }
}
