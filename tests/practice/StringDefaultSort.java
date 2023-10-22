package tests.practice;
import java.util.*;

public class StringDefaultSort {
    public static void main(String[] args) {

        String[] strArr = new String[]{"apple", "banana", "hello", "cat", "dog", "adidas", "zebra"};

        Arrays.sort(strArr);

        String[] strNumArray = new String[]{"10", "90", "1000", "87"};

        Arrays.sort(strNumArray);

        for (String str : strArr) {
            System.out.println(str);
        }

        for (String str : strNumArray) {
            System.out.println(str);
        }



    }
}   
