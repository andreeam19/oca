package w0_intro;

public class Ex1b_CheckTrianglesBySides {
    /**
     * Method which computes if 3 given LENGTH values can be the sides of a valid triangle
     *
     * @return true if they can form a triangle, false otherwise
     */

    static boolean canFormValidTRiangle(int side1, int side2, int side3) {
        //check sum of any 2 sides is greater than third (need to be true for ALL 3 possible combinations)
        return (side1 + side2 > side3)
                && (side1 + side3 > side2)
                && (side2 + side3 > side1);
    }

    /**
     * Method which computes if 3 given length values:
     * - can be the sides of a valid triangle
     * - AND that triangle is also right-angled
     *
     * @return true if they can form a right-angled triangle, false otherwise
     */
    static boolean canFormValidRightAngledTrangle(int side1, int side2, int side3) {
        return canFormValidTRiangle(side1, side2, side3) && ///all basic checks (reuse previous method)
                (pythagoras(side1, side2, side3) ||
                        (pythagoras(side1, side3, side2) ||
                                pythagoras(side2, side3, side1)));
    }

    private static boolean pythagoras(int shortSide1, int shortSide2, int longSide) {
        return shortSide1 * shortSide1 + shortSide2 * shortSide2 == longSide * longSide;
    }

    public static void main(String[] args) {
        testIt(1,2,4);
        testIt(4,1,3);
        testIt(1,2,2);
        testIt(3,4,5);
        testIt(-1,-2,-2);
        testIt(0,0,0);

    }
    private static void testIt(int side1, int side2, int side3){
        System.out.println("\nSides ("+side1+","+side2+","+side3+") ->"+
                "valid triangle? : "+canFormValidTRiangle(side1,side2,side3));
        System.out.println("Sides ("+side1+","+side2+","+side3+") ->"+
                "right-angle triangle? : "+canFormValidRightAngledTrangle(side1,side2,side3));
    }
}

