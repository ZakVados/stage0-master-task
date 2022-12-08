package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
    	int res = 0;
        String[] arr = Integer.toString(number).split("");
        for (String ch: arr) {
        	res += Integer.parseInt(ch);
        }
        System.out.println(res);
    }

}
