import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodingGameTest {

    public static void main(String args[])   {

        //binary search for sorted arrays
System.out.println(computeJoin(471,480));
System.out.println(677/1000);
        //BigDecimal b = new BigDecimal("0");
        System.out.println(predictCrimes());
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");

        ArrayList l = new ArrayList(2);
        l.add(1);
        l.add(1);
        l.add(1);
        String twin1="Romain";
        String twin2="Marion";
        System.out.println(isTwiin(twin1,twin2));

        int[] closest = {100, 70, -3, 4, -2, 1, -1, 9};
        System.out.println(closestToZero(closest) + " closestToZero ");

        int[] prices = {100,10,10,10,10,10};
        System.out.println(calculateTotalPrice(prices,10));
        int[] fromIds = {1, 7, 3, 4, 2, 6, 9};

        int[] toIds = {3, 3, 4, 6, 6, 9, 5};
        int startNodeId = 7;
        IntStream.of(fromIds).boxed().collect(Collectors.toList());
        Integer endpointNode = findNetworkEndpoint(startNodeId, fromIds, toIds);
        System.out.println(endpointNode + " *******");
        System.out.println(getPositionAt(2147483647));
        System.out.println(floatingSum("99.35","1.10"));
        try {
            print(new StringReader("HEEEY"));
        }catch (IOException e){
            System.out.println("error");
        }

        int testCalc[]={0,1,2,3,0};

        System.out.println(reshape(3,"abc ter fmm"));
        System.out.println(calc(testCalc,1,testCalc.length-1));
        Number n = 3;
        Vehicule vehicule = new Vehicule(0);
        System.out.println(vehicule);
        Vehicule vehicule2 = new Vehicule(0);
        System.out.println(vehicule2);
        vehicule=vehicule2;



        System.out.println(vehicule);
        System.out.println(vehicule2);
        vehicule2=null;
        System.out.println(vehicule);
        System.out.println(vehicule2);
        System.out.println("vehicule "+ vehicule.a);

        String[]asc = {"f","o","o","b","a","r"};

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Optional Empty = "+ optionalEmpty.orElse(null));
        Change change= optimalChange(98);
        System.out.println(change.coin2 +" "+change.coin5 + " " + change.coin10);
        Optional opper =Arrays.asList(asc).stream().reduce((c,b)->c+b);
        System.out.println("*****");
        System.out.println(opper.get());

        ArrayList ll = new ArrayList(2);
        ll.add(1);
        ll.add(1);
        ll.add(1);
        System.out.println(l.size() +" size");
        System.out.println( IntStream.range(0,4).sum());
        System.out.println( 2>>1); //1
        String a ="";
        HashMap m =new HashMap();
        Object o1 = new Object();
        Object o2 = o1;
        m.put(o1,1);
        m.put(o2,2);
        System.out.println(m.get(o1)); // 2 object 2 ecrase object 1 puisque equals in object est ==
        System.out.println("****");
        TreeMap treeMap = new TreeMap();
        treeMap.put(3,3);
        treeMap.put(2,1);
        treeMap.put(1,2);
        treeMap.values().forEach(System.out::println);

        System.out.println("****");
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet.size());

        System.out.println(LocalDate.of(2016,1,31).plusMonths(1)); // 29 fevrier
        System.out.println(LocalDate.of(2016,12,31).plusDays(1));  // 1 janvier 2017

        StringBuilder s = new StringBuilder("");

        String ss;
        int i=0;
        System.out.println(i++);

        int i1=5;
        int i2=2;
        int i3=i1/i2;
        System.out.println(i3);

        System.out.println("istrue "+istrue(1,2));
        System.out.println("istrue "+istrue(-1,2));
        System.out.println("istrue "+istrue(-2,2));
        //System.out.println(m.get(o1));
   System.out.println(checkString("(([]))"));
        /* System.out.println(checkString("[(())]"));
        System.out.println(checkString("[(()])"));
        System.out.println(checkString("[([()])"));
        System.out.println(checkString("[(([(]))]"));
*/
    }

   public static synchronized boolean checkString(String str){

        if(str==null||str.isEmpty()){return true;}
        Map<String,Integer> mapCalculation = new HashMap<>();
        mapCalculation.put("[",0);
        mapCalculation.put("(",0);
        mapCalculation.put(")",0);
        mapCalculation.put("]",0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='['){mapCalculation.put("[",mapCalculation.get("[")+1);}
            if(str.charAt(i)=='('){mapCalculation.put("(",mapCalculation.get("[")+1);}
            if(str.charAt(i)==')'){
            if(i<str.length()-1 && str.charAt(i+1)==']' && mapCalculation.get("(")!=mapCalculation.get(")")+1){ return false;}
                else {mapCalculation.put("(",mapCalculation.get("]")+1);}
            }
            if(str.charAt(i)==']'){
                if(mapCalculation.get("]")+1!=mapCalculation.get("[")){return false;}
                mapCalculation.put("]",mapCalculation.get("]")+1);
            }
        }
        return true;
    }

   /* public static Integer count(){
        synchronized(this) {
            counter =counter+1;
        }

        return counter;
    }
public static int counter=0;
*/

   public static Integer calc(int[]array,int a , int b){

       IntStream.of(new int[]{1,2,3}).sum();
       return IntStream.of(Arrays.copyOfRange(array,a,b)).map(Integer::valueOf).sum();

 /*
int sum=0;
       for(Integer iter:Arrays.copyOfRange(array,a,b)){
    sum+=iter;
       }
return sum;
*/
   }

   static void print(Reader reader) throws IOException {
       try {
               int code = reader.read();
               StringBuilder st = new StringBuilder();
                 while(code !=-1){
                    st.append((char)code);
                   code = reader.read();
       }
                 System.out.println(st);
       }catch (IOException e){
           throw e;
       }
       finally {
           reader.close();
       }

   }
   static String reshape(int n, String str){
       str=str.replaceAll(" ","");
       String result="";
       for(int i=0;i<str.length();i++){

           if(i%n==0 && i!=0){
               result+=System.lineSeparator();
           }
           result+=str.charAt(i);
       }
       return  result;
   }
    static boolean  istrue(int i,int j){
        return i==1 || j==1 || i+j==1;
//       return (i==1||j==1) ?true: ( (i+j==1)?true:false);
   }

   public static int findLargest(int[]numbers){
       return IntStream.of(numbers).max().getAsInt();
   }

   public static int findNetworkEndpoint(int startNode, int[]fromIds, int[]toIds){
        boolean notFound=true;
       int indexFrom=0;
       int finalIndex=0;
       List<Integer> fromList = IntStream.of(fromIds).boxed().collect(Collectors.toList());
       while(notFound){
              indexFrom = fromList.indexOf(startNode);
              finalIndex=fromList.indexOf(toIds[indexFrom]);

           if(finalIndex<indexFrom){
               return toIds[indexFrom];
           }
           else{startNode=fromList.get(finalIndex);}
       }
        return fromList.get(indexFrom);
   }

   static int getPositionAt(int n){
     switch(n%6){
         case 0: return 0;
         case 2: return 1;
         case 1: return -1;
         case 3: return -4;
         case 4: return -5;
         case 5: return -3;
     }
return 0;

       /*  Integer position =-1;
       Integer stage1=1;
       Integer stage2=-2;
       Integer stageAux=0;
       for(int i=3;i<=n;i++){
           position +=stage2 - stage1;
           stageAux=stage1;
           stage1=stage2;
           stage2+= - stageAux;
           stageAux=null;
       }
       return position;
       */
   }

    public static int computeJoin(int s1,int s2){
       boolean notyet=true;
       Integer p1=s1;
       Integer p2=s2;
       while(notyet && p1<20000000){
           final int[] ints2 = Stream.of(p1.toString().split(""))
                   .mapToInt(Integer::parseInt)
                   .toArray();
           final int[] ints1 = Stream.of(p2.toString().split(""))
                   .mapToInt(Integer::parseInt)
                   .toArray();

           p1=p1+IntStream.of(ints2).map(Integer::valueOf).sum();
           p2=p2+IntStream.of(ints1).map(Integer::valueOf).sum();
       if(p1==p2) notyet=false;
       }
       return p1;
    }

   public static boolean isTwiin(String a,String b){
       char[] t1=a.toUpperCase().toCharArray();
       char[] t2=b.toUpperCase().toCharArray();
       Arrays.sort(t1);
       Arrays.sort(t2);
        return  Arrays.equals(t1,t2);
   }

    static char  ScanChar(String art)
    {
        // Iterate over each character from A to Z.
        for (char c = 'A'; c <= 'Z'; c++)
        {
            // Check to see if the character corresponds with the ASCII art. asciiArt.printChar(c)
            if ( String.valueOf(c)  == art)
            {
                // Return the character if it does.
                return c;
            }
        }

        // Optionally use a null character to indicate that the string passed
        // doesn't correspond to any valid ASCII art.
        return (char)0;
    }


    static String floatingSum(String ... numbers){
       BigDecimal result = new BigDecimal("0");
       for(String val:numbers){
           result=result.add(new BigDecimal(val));
       }
       return result.toString();
   }

   public static Change optimalChange(long val){
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




    public static String predictCrimes() {
        String crime="";
        for(int i=0;i<30;i++){
            String TimestampString=""+System.currentTimeMillis();
            Integer firstPart=(int)Math.floor(Math.random() * 1001);
            while(firstPart/100==0){firstPart*=10;}

            String crimePart2=TimestampString.substring(3,5);
            String crimePart3=TimestampString.substring(4,8);
            // It's your turn to play!
            crime += "Crime predicted: "+firstPart+"-"+crimePart2+"-"+crimePart3+"\n";
            Integer lastPart =(int)Math.floor(Math.random() * 10000)+1;
            while(lastPart/1000==0){lastPart*=10;}
            crime+="Calling: 1-"+TimestampString.substring(7,10)+"-555-"+lastPart+"\n";
        }
        return crime;
    }


   public static int closestToZero(int[]values){
       int closest=values[0];
       for(int i=0;i<values.length;i++){

           if(Math.abs(values[i])<Math.abs(closest)){
               closest=values[i];
           }
           else if(Math.abs(values[i])==Math.abs(closest) && values[i]>closest){
               closest=values[i];
           }
       }
       return closest;
   }

    public  static int calculateTotalPrice(int[]prices,int discount){
        Arrays.sort(prices);
        double somme=0;
        for(int i=0;i< prices.length-1;i++){
            somme+=Double.valueOf(prices[i]);
        }

        int maxVal=prices[prices.length-1];
        somme+=(maxVal-((maxVal*discount)/100));
        return  (int)(Math.floor(somme));
    }

    private static final String FOO="foo";
    public static boolean isFoo(String param){
       return FOO.equals(param);
    }
}



    class Change{
        long coin2=0;
        long coin5=0;
        long coin10=0;
    }
