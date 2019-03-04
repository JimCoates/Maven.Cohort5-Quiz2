package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    ArrayList<Integer> answer;

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        answer = new ArrayList<>(Arrays.asList(array1));

        for (int i = 0; i < array2.length; i++) {
            answer.add(array2[i]);
        }
        Integer[] solution = answer.toArray(new Integer[answer.size()]);
        return solution;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList<Integer> temp = new ArrayList<>();
        answer = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i < index; i++) {
            temp.add(array[i]);
            answer.remove(0);
            answer.add(temp.get(i));
        }

        Integer[] solution = answer.toArray(new Integer[answer.size()]);
        return solution;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer counter = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                counter++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public int count(Integer[] array, Integer valueToCount) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (valueToCount.equals(array[i])) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer common = array[0];
        int commonCount = count(array, common);

        for(int i = 0; i < array.length; i++) {
            Integer currentNumber = array[i];
            int currentCount = count(array, currentNumber);

            if (currentCount > commonCount) {
                common = currentNumber;
                commonCount = currentCount;
            }
        }

        return common;
    }

}

