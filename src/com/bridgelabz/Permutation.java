package com.bridgelabz;

public class Permutation {

    public static void main(String[] args) {
        String string = "Shrav";
        int length = string.length();
        System.out.println("All the permutation of the string are: ");
        generatePermutation(string, 0, length);
    }
    public static String swapChar(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void generatePermutation(String string, int left, int right) {
        if (left == (right - 1))
            System.out.println(string);
        else {
            for (int i = left; i < right; i++) {
                string = swapChar(string, left, i);
                generatePermutation(string, left + 1, right);
                string = swapChar(string, left, i);
            }
        }
    }
}
