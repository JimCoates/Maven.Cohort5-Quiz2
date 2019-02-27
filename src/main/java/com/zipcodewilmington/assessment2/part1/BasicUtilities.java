package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    Boolean answer = false;

    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5) {
            answer = true;
        }
        return answer;
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {
            answer = true;
        }
        return answer;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate >= 5 && valueToEvaluate <= 7) {
            answer = true;
        }
        return answer;
    }

    public Boolean startsWith(String string, Character character) {
        String test1 = string.toLowerCase();
        Character char1 = Character.toLowerCase(character);

        if (test1.charAt(0) == char1) {
            answer = true;
        }
        return answer;
    }
}
