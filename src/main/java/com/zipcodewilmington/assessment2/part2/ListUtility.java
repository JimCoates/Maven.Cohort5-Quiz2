package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
        List<Integer> list;


    public ListUtility(){
        this.list = new ArrayList<>();
    }

    public Boolean add(Integer i) {
        list.add(i);
        return list.contains(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer element : list) {
            if(!answer.contains(element)) {
                answer.add(element);
            }
        }

        return answer;
    }

    public String join() {
        String answer = "";

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
            if(i < list.size()-1){
                answer += ", ";
            }

        }

        return answer;
    }

    public Integer mostCommon() {
        Integer mostCommon = list.get(0);
        int commonCount = countOccurrence(mostCommon);

        for (int i = 0; i < list.size() ; i++) {
            Integer currentNumber = list.get(0);
            int currentCount = countOccurrence(currentNumber);
            if(currentCount > commonCount){
                mostCommon = currentNumber;
                commonCount = currentCount;
            }
        }

        return mostCommon;
    }

    private int countOccurrence(Integer valueToCount) {
        int count = 0;

        for(Integer currentValue : list) {
            if (currentValue == valueToCount) {
                count++;
            }
        }

        return count;
    }


    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
