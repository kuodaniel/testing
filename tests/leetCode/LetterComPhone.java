package tests.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterComPhone {
    public static void main(String[] args) {
        System.out.println("Letter Combinations of a Phone Number");
        System.out.println(letterCombinations("23"));
    }

    static List<String> res;
    static Map<Character, String> map;
    
    public static List<String> letterCombinations(String digits) {
        
        if (digits.length() == 0) return Collections.emptyList();

        // set up the map
        map = new HashMap();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        res = new ArrayList();
        backtrack("", digits);

        return res;
    }

    private static void backtrack(String combination, String next) {
        if (next.length() == 0) {
            res.add(combination);
        }
        else {
            String letters = map.get(next.charAt(0));
            for (char c : letters.toCharArray()) {
                // c is to be added to all the string before
                backtrack(combination + c, next.substring(1));
            }
        }
    }
}
