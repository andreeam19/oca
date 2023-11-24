package w0_intro;

public class Ex2_TimeConverter {

    /**
     * Given a time duration expressed in a number of hours + some minutes + some seconds,
     * it converts it to a total number of milliseconds
     *
     * @param h number of hours (valid range: 0..23)
     * @param m number of minutes (valid range: 0..59)
     * @param s number of seconds (valid range: 0..59)
     * @return the total number of milliseconds, or -1 if any of the input parameters has invalid value
     */

   // static int convertToMiliseconds(int h, int m, int s) {
    //    boolean allValid = inRange(h, 0, 23)
     //           && inRange(m, 0, 59)
     //           && inRange(s, 0, 59);
     //   int totalMs=((h*60*m));
    //}

    private static boolean inRange(int x, int min, int max) {
        return min <= x && x <= max;
    }
}
