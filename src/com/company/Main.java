package com.company;

public class Main {

    public static void main(String[] args) {
        int row, column;
        for (row = 1; row <= 9; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
    }
