package w0_intro;

public class Ex1a_CheckTriangleByAngles {
    /**
     * Method which computes if 3 given ANGLE values (in degrees) can be the angles of a valid triangle
     *
     * @return true if they can form a triangle, false otherwise
     */
    static boolean canFormValidTriangle(int angle1, int angle2, int angle3){
        return (angle1>0 && angle2>0 && angle3>0) //check all positive
                &&(angle1+angle2+angle3==180);//AND sum is 180
    }
    /**
     * Method which computes if 3 given ANGLE values (in degrees):
     * - can form a valid triangle
     * - AND that triangle is also right-angled
     *
     * @return true if they can form a right-angled triangle, false otherwise
     */
    static boolean canFormValidRightAngledTriangle(int angle1, int angle2,int angle3){
        return canFormValidRightAngledTriangle(angle1,angle2,angle3) &&
                (angle1==90 ||angle2==90 ||angle3==90);

    }
}
