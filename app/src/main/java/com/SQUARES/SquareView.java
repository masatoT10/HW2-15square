package com.SQUARES;

public class SquareView {
    public static int count = 0;
    public static boolean scramble = false;

    public static boolean start = false;
    public static int [] red = {1,2,3,4,5,9,13};
    public static int [] green = {11,12,15};
    public static int [] blue = {6,7,8,10,14};
    public static int [][] squares = new int[][] {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
}
