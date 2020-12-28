
import Utils.Utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static Utils.Utils.testRun;

public  class main {

    private  int value=3;

    public static void main(String[] args){
        Utils utils = new Utils();
        Utils utils2 = new Utils();

        String str = "avbkjd1122klj4 54.3 af";
        System.out.println(extractInt(str));


      /*  Int1 proxy = (Int1) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Int1.class, Int2.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("D");
                        method.invoke(o,args);
                        System.out.println("A");
                        method.invoke(o,args);
                        return null;
                    }
                }
        );
        proxy.print();*/
        utils.testRun();
        utils2.testRun();
        //testRun();
        List l = new ArrayList();
        l.add("Hello");
        l.add(2);
        System.out.println(l.get(0) instanceof Object);
        int aaa=1;
        int bbb= 0;
        "String".compareTo("String");
        //int c=aaa/bbb;
        //System.out.println(c);
        System.out.println(new main().message());
        System.out.println(new Main2().message());
        String message= "HEllo";
        char[]sss=new char[3];

int xxx=5;
xxx=10;
        System.out.println(xxx);

        for(int i=0;i<message.length();i++){
            //System.out.println(message.charAt(i+1)); = error
        }

        Boolean.parseBoolean("FalSe");
        Optional<List<String>> listOptional= Optional.of(Arrays.asList("aaaa","bbbb"));



        String val = listOptional.get().get(0);
        List<Optional<String>> listOfOp = Arrays.asList(Optional.of("ttt"),Optional.of("rrr"));

        listOfOp.stream().map(Optional::get).map(String::toUpperCase);

        Optional<Integer> in = Optional.ofNullable(null);

        //System.out.println(in.get());

        List<String> listToGtoupBySize= Arrays.asList("1","12","99","123","1234","12345");

        listToGtoupBySize.stream().sorted();

        listToGtoupBySize.stream().sorted((a,b)->{
            return a.length()-b.length();
        });

        Map<Integer,List<String>> mapBySize= listToGtoupBySize.stream()

                                                     .collect(Collectors.groupingBy(x->x.length()));
        mapBySize.keySet().forEach(System.out::println);
        mapBySize.entrySet().forEach(System.out::println);
        //System.out.println( 16  >>  3);
        mapBySize.computeIfAbsent(6,w->Arrays.asList("696969"));


        System.out.println( "*************** * * * *");
        mapBySize.keySet().forEach(System.out::println);
        mapBySize.entrySet().forEach(System.out::println);

        int value=11;
        main m = new main();
        m.getV();
        Stream.of("Fred", "Jim", "Sheila")
                .peek(System.out::println)
                .filter(s->s.contains("F"))
                .peek(a->System.out.println("here "+a))
                .collect(Collectors.toList());

    System.out.println("***************************");
        Map<String, Long> counters = listToGtoupBySize.stream()
                        .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        HashSet mp=new HashSet();

        counters.put(null,10L);

        counters.keySet().forEach(System.out::println);
        counters.values().forEach(System.out::println);
        System.out.println("***************************");
        // .collect(z->Collectors.groupingBy(z),Collections.frequency(listToGtoupBySize,z));
               //.collect(Collectors.groupingBy(x->x),Collections.frequency(listToGtoupBySize,x)));



        int az= Collections.frequency(listToGtoupBySize,"1");

        Clock.systemDefaultZone();

       boolean oui= Arrays.asList("Fred", "Jim", "Sheila")
                .stream()
                .peek(System.out::println)
                .allMatch(s -> s.startsWith("F"));

        int myArray[] = {1,2,3,4,5};
        for(int n : myArray) { System.out.println(n); }
        System.out.println(myArray[0]);

        int myArray2[][] = new int[2][];

        byte bb = 0b1010101;
        byte b =  0b111;
        byte test=123;
        int n=0b111;
        {n++;}

        int number2 = 0111000;
        System.out.println(number2 + " * * * "+ b+ " "+n);
        LocalDate date1 = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDateTime date2 = LocalDateTime.of(2017, Month.JUNE, 1, 1, 1);
        //Period p = Period.between(date1, date2);
        //System.out.print(p.getYears() + ":" + p.getMonths() + ":" + p.getDays());

            //    .max((a,b)->a.length()-b.length());
            //    .allMatch(s -> s.startsWith("F"));

        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        nameStream.peek(System.out::println);

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());


            Thread t = new Thread(()->{
                System.out.println("thread hehehe");
            });

            t.start();

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 2 hehehe");
                }
            };

            Thread tt = new Thread(r::run);
            tt.start();

        Vehicule v =new Voiture(12);
       List<Integer> vs= Arrays.asList(v).stream().filter(Objects::nonNull)
               .map((vm)->vm.a)
        .collect(Collectors.toList());
       vs.forEach(System.out::println);
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        //letters.stream().reduce((a,b)->a.toUpperCase()+b).ifPresent(System.out::println);
        List<String> stringList = getListOfStrings(numbers,x->x.stream().map(String::valueOf).collect(Collectors.toList()));
        Integer a = getListAfterRule("12",() -> s -> Integer.valueOf(s)/2);

        RefrenceFunction ref = new RefrenceFunction() {
            @Override
            public Function<String, Integer> convertAndDevide() {
                return a->Integer.valueOf(a)/2;
            }
        };
        ref.convertAndDevide().apply("16");
        //   Arrays.asList(v).stream().filter(Objects::isNull).filter(Voiture::isMachine);
   //     Arrays.asList(v).stream().filter(Objects::isNull).sorted(Voiture::isAVoiture);
        //Voiture vv = (Voiture) new Vehicule(13);
   //     v.demarrer();
 //       v.arreter();
  //      Voiture vv = new Voiture(13);
  //      vv.marche();
       // vv.demarrer();
      //  vv.arreter();
    }


    static String extractInt(String str)
    {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^\\d]", " ");

        // Remove extra spaces from the beginning
        // and the ending of the string
        str = str.trim();

        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }




    public static List< String> getListOfStrings(List <Integer> integerList,ReferenceTest testFunction){
        return  testFunction.mapListTo(integerList);
    }

public static Integer getListAfterRule(String s , RefrenceFunction function){
        return function.convertAndDevide().apply(s);
}

    Object message(){
        return "Hello";
    }

public void getV(){
        int value=4;
        System.out.println("3");}

    static class Main2 extends main{
String message(){
    return "World!";
}
    }

}
