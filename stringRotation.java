public class stringRotation {

    public static boolean isSubtring(String a, String b) {
        int p1 = 0, p2 = 0;
        while (p1 < a.length()) {
            if (p2 == b.length()) {
                return true;
            }
            if (a.charAt(p1) == b.charAt(p2)) {
                p1 += 1;
                p2 += 1;
            } else {
                p2 = 0;
                p1 += 1;
            }
        }
        return false;
    }

    /*
     * Break string a into two parts, x and y. If b was a rotation of a there should
     * be some yx s.t. b = yx and a = xy. a + a = xyxy and note that yx appears in
     * here
     * Thus, if b is a rotation of a, b should appear as a substring of aa
     * 
     * 
     * 
     */
    public static boolean stringRotationFunc(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return isSubtring(a + a, b);
    }
}
