package changeTest;

public class Solution {

    public static void main(String[]args){
        Change change1= new Change();
        Change change2= new Change();
                 change1=optimalChange(10);
                 change2=optimalChanges(10) ;
        System.out.println(change1.coin2+" "+change1.coin5 +" "+change1.coin10);
        System.out.println(change2.coin2+" "+change2.coin5 +" "+change2.coin10);

        System.out.println("************");


        change1=optimalChange(3356);
        change2=optimalChanges(3356) ;
        System.out.println(change1.coin2+" "+change1.coin5 +" "+change1.coin10);
        System.out.println(change2.coin2+" "+change2.coin5 +" "+change2.coin10);


        System.out.println("************");


        change1=optimalChange(99748763l);
        change2=optimalChanges(99748763l) ;
        System.out.println(change1.coin2+" "+change1.coin5 +" "+change1.coin10);
        System.out.println(change2.coin2+" "+change2.coin5 +" "+change2.coin10);


        System.out.println("************");

        change1=optimalChange(1);
        change2=optimalChanges(1) ;
        System.out.println(change1.coin2+" "+change1.coin5 +" "+change1.coin10);
        System.out.println(change2.coin2+" "+change2.coin5 +" "+change2.coin10);

    }

    static Change optimalChange(long s) {
        Change c = new Change();
        if(s>=10) {
            c.coin10=s/10;
            if(s%10>=5) {
                c.coin5=(s%10)/5;
                if((s%10)%5>=2) {
                    c.coin2=((s%10)%5)/2;
                }
            }else if(s%10>=2){
                c.coin2=(s%10)/2;
            }
        }else if(s>=5 && s<10) {
            c.coin5=s/5;
            if(s%5>=2){
                c.coin2= (s%5)/2;
            }
        }else if(s>2 && s<5) {
            c.coin2=s/2;
        }
        return c;
    }
    public static Change optimalChanges(long val){
        long coin2=0,coin5=0,coin10=0;

        if(val/10>0)
        {
            coin10 = val/10;
            val=val-(coin10*10);
        }
        if(val/5>0){
            coin5=val/5;
            val=val%5;
        }
        if(val/2>0){
            coin2=val/2;
        }
        Change c= new Change();
        c.coin2=coin2;
        c.coin5=coin5;
        c.coin10=coin10;
        return c;
    }

}
