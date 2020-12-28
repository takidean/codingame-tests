package monnaie;

public class Solution {
    
    public static void main(String[]args){
        Monnaie monnaie1=monnaieOptimale(10) ;
        System.out.println(" 2: "+ monnaie1.piece2+" 5: "+monnaie1.billet5 +" 10: "+monnaie1.billet10);
        System.out.println("************");

         monnaie1=monnaieOptimale(3356);
        System.out.println(" 2: "+ monnaie1.piece2+" 5: "+monnaie1.billet5 +" 10: "+monnaie1.billet10);
         System.out.println("************");


        monnaie1=monnaieOptimale(9223372036854775807l);
        System.out.println(" 2: "+ monnaie1.piece2+" 5: "+monnaie1.billet5 +" 10: "+monnaie1.billet10);
 

        System.out.println("************");
        monnaie1=monnaieOptimale(1);
        System.out.println(null==monnaie1);
 
    }
    
    public static Monnaie monnaieOptimale(long s){
        if(s==1|| s==0){return null;}
        long piece2=0,billet5=0,billet10=0;

        if(s/10>0)
        {
            billet10 = s/10;
            s=s-(billet10*10);
        }
        if(s/5>0){
            billet5=s/5;
            s=s%5;
        }
        if(s/2>0){
            piece2=s/2;
        }
        if(piece2==0 && billet5==0 && billet10==0){return null;}
        Monnaie monnaie= new Monnaie();
        monnaie.piece2=piece2;
        monnaie.billet5=billet5;
        monnaie.billet10=billet10;

        return monnaie;
    }

}
