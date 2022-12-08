package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // add prefix:
            for (int j = cathetusLength; j >= 1; j--) {
                if (j > i) System.out.print(' ');
                else System.out.print(j);
            }
            // add appendix:
            for (int k = 2; k <= cathetusLength; k++) {
                if (k <= i) System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
