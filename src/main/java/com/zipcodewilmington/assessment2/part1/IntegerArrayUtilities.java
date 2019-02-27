package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean answer = false;

    public Boolean hasEvenLength(Integer[] array) {
        if ((array.length % 2) == 0) {
            answer = true;
        }
        return answer;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = start; i <= stop; i++){
            temp.add(i);
        }
        Integer[] solution = temp.toArray(new Integer[temp.size()]);
        return  solution;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
