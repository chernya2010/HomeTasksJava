package class_lesson.lesson10.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Methods {

    public void getColorList(ArrayList<String> color){
        System.out.println(color);
    }

    public void printCollection(Collection<String> collection){
        System.out.println(collection);
    }

    public void addOrange(ArrayList<String> color){
        color.add(1,"Orange");
        System.out.println(color);
    }

    public void changeColor(ArrayList<String> color){
        for(int i = 0; i < color.size(); i++){
            if(color.get(i).equals("Green")){
//                color.remove("Green");
//                color.add("White");
                color.set(i, "White");
            }
        }
        System.out.println(color);
    }

    public void getReverseList(ArrayList<String> list){
        Collections.reverse(list);
        System.out.println(list);
    }

    public void swapFirstAndLast(ArrayList<Integer> numbers){
        int first = numbers.get(0);
        int last = numbers.get(numbers.size() - 1);
        numbers.set(0, last);
        numbers.set(numbers.size() - 1, first);
        System.out.println(numbers);

    }

    public void join(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);
    }

    public void printUniqueCharacters(String s){
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for(char el : chars){
            set.add(el);
        }
        System.out.println(set);
        System.out.println(set.size());
    }

    public void getPalindroms(HashSet<String> set){
        for (String el : set){
            StringBuffer reversedString = new StringBuffer(el).reverse();
            if(el.equalsIgnoreCase(reversedString.toString())){
                System.out.println(el);
            }
        }
    }
}
