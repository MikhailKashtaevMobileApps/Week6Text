package com.example.mike.week6test;

import java.util.ArrayList;

public class SpiralPrinter {

    // Turned out anticlockwise tho

    public static void main(String[] args) {
        Integer[][] testArray1 = new Integer[][]{
                new Integer[]{1,    2,   3,   4},
                new Integer[]{5,    6,   7,   8},
                new Integer[]{9,   10,  11,  12},
                new Integer[]{13,  14,  15,  16}
        };
        print(testArray1);

        Integer [][] testArray2 = new Integer[][]{
                new Integer[]{1,   2 ,  3 ,  4 , 5 ,  6},
                new Integer[]{7 ,  8   ,9 , 10 , 11 , 12},
                new Integer[]{13,  14 , 15 ,16  ,17 , 18}
        };
        print(testArray2);
    }

    public static void print( Integer[][] array ){
        Integer x = array.length,
                y = array[0].length,
                total = x*y,
                printed = 0;

        Integer[] cursor = new Integer[]{0,0};
        ArrayList<Integer> spiralDirection = new ArrayList<>();
        spiralDirection.add(1);//traverse to right on x
        spiralDirection.add(0);// traverse down on y
        spiralDirection.add(0);// travers left on x
        spiralDirection.add(0);//travers up on y

        Integer[] spiralBounds = new Integer[]{
                x-1,
                y-1,
                0,
                0
        };
        System.out.print("\n");
        while ( printed < total ){
            System.out.print( array[cursor[0]][cursor[1]]+" " );
            printed += 1;

            if ( spiralDirection.get(0) == 1 && cursor[0] == spiralBounds[0] ||
                    spiralDirection.get(1) == 1 && cursor[1] == spiralBounds[1] ||
                    spiralDirection.get(2) == 1 && cursor[0] == spiralBounds[2] ||
                    spiralDirection.get(3) == 1 && cursor[1] == spiralBounds[3] ){
                // Reached end of bounds need to switch direction
                incrementSpiral(spiralDirection, spiralBounds);
            }

            switch ( spiralDirection.indexOf(1) ){
                case 0:
                    cursor[0]++;
                    break;
                case 1:
                    cursor[1]++;
                    break;
                case 2:
                    cursor[0]--;
                    break;
                case 3:
                    cursor[1]--;
                    break;
            }

        }

        System.out.print("\n");

    }

    private static void incrementSpiral(ArrayList<Integer> spiral, Integer[] bounds){
        // change spiral
        Integer index = spiral.indexOf(1);
        spiral.set((index+1)%spiral.size(), 1);
        spiral.set(index, 0);

        //change bounds
        switch( index ){
            case 0:
                bounds[3] += 1;
                break;
            case 1:
                bounds[0] -= 1;
                break;
            case 2:
                bounds[1] -= 1;
                break;
            case 3:
                bounds[2] += 1;
                break;
        }
    }

}
