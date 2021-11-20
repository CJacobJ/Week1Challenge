package Week1Challenge;

import java.util.ArrayList;

public class Week1Solution {

    public static boolean ascending(String numbers) {
        if (!checkNum(numbers)) {
            return false;
        }
        int numbersLength = numbers.length();
        ArrayList<Integer> lengthList = getValidLengths(numbersLength);
        for (Integer num : lengthList) {
            ArrayList<String> substrs = getSubnumbers(numbers, num);
            ArrayList<Integer> intList = convertList(substrs);
            if (checkValid(intList)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkNum(String number) {
        try {
            Integer.parseInt(number);
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    private static ArrayList<Integer> getValidLengths(int totalLength) {
        ArrayList<Integer> validLengths = new ArrayList<>();
        for(int i = 1; i <= totalLength / 2; i++) {
            if(totalLength % i == 0) {
                validLengths.add(i);
            }
        }
        for (Integer i : validLengths) {
        }
        return validLengths;
    }

    private static ArrayList<String> getSubnumbers(String numbers, Integer num) {
        ArrayList<String> subnums = new ArrayList<>();
        for(int i = 0; i < numbers.length(); i += num) {
            subnums.add(numbers.substring(i, i + num));
        }
        return subnums;
    }

    private static boolean checkValid(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            if (intList.get(i) != intList.get(i + 1) - 1) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> convertList(ArrayList<String> strList) {
        ArrayList<Integer> intList = new ArrayList<>();
        for(String str : strList) {
            intList.add(Integer.parseInt(str));
        }
        return intList;
    }

    public static int[][] squarePatch(String str) {
        if (!checkNum(str)) {
            return new int[0][];
        }
        return squarePatch(Integer.parseInt(str));
    }

    public static int[][] squarePatch(int patchInt) {
        int[][] square = new int[patchInt][patchInt];
        for (int[] row : square) {
            for (int i = 0; i < row.length; i++) {
                row[i] = patchInt;
            }
        }
        return square;
    }

}
