package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        String[] arr = Integer.toString(number).split("");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
