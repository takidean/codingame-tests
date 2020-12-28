package minion;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {


    public  static void main(String[]args){

        EnumMap<Provided.Fruit, Integer> em = new EnumMap<Provided.Fruit, Integer>(Provided.Fruit.class);
        em.put(Provided.Fruit.APPLE,2);
        em.put(Provided.Fruit.ORANGE,3);
        em.put(Provided.Fruit.BANANA,12);
        em.put(Provided.Fruit.APRICOT,5);
        em.put(Provided.Fruit.PEAR,1);

        int res= fruitSalad(em);
        System.out.println(res);
    }

    public static int fruitSalad(EnumMap<Provided.Fruit, Integer> fruits) {

        List<Set<String>> listOfCombinations = new ArrayList<>();

       List<Provided.Fruit> keySet= fruits.entrySet().stream()
                .sorted(Map.Entry.<Provided.Fruit, Integer>comparingByValue().reversed())
                .map(e->e.getKey())
                .collect(Collectors.toList());

        for(Provided.Fruit fruit:keySet){
            if(fruits.get(fruit)==0) continue;
            if(listOfCombinations.isEmpty()){
                for(int i=0;i<fruits.get(fruit);i++) {
                    Set<String> fruits1 = new HashSet<>();
                    fruits1.add(fruit.name());
                    listOfCombinations.add(fruits1);
                }
                continue;
            }
            int i=0;
            while(i<listOfCombinations.size()){
                 boolean contains =listOfCombinations.get(i).contains(fruit.name());

                if(contains==false && fruits.get(fruit)>0 && listOfCombinations.get(i).size()<3){
                    Set<String> fruitsArray=listOfCombinations.get(i);
                    fruitsArray.add(fruit.name());
                    fruits.put(fruit,fruits.get(fruit)-1);
                    listOfCombinations.add (i,fruitsArray);
                    listOfCombinations.remove(i+1);
                }
                else{
                    i++;
                }

            }
        }

        Set<Set<String>> listToreturn= listOfCombinations.stream()
                .filter(set->set.size()==3)
                .collect(Collectors.toSet());
        listToreturn.forEach(s->{
            s.forEach(System.out::println);
        });
System.out.println("*******************");
        List<Set<String>> l= listOfCombinations.stream()
                .filter(set->set.size()==3)
                .collect(Collectors.toList());
        l.forEach(s->{
            s.forEach(System.out::println);
        });

        return listToreturn.size();
    }

    }
