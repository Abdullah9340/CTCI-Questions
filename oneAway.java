
public class oneAway {

    public static boolean oneAwayFunction(String a, String b) {
        if (a.length() == b.length()) {
            return canReplace(a, b);
        } else if (a.length() + 1 == b.length()) {
            return canInsert(a, b);
        } else if (a.length() - 1 == b.length()) {
            return canInsert(b, a);
        }
        return false;
    }

    public static boolean canReplace(String a, String b) {
        boolean differenceFound = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (differenceFound) {
                    return false;
                }
                differenceFound = true;
            }
        }
        return true;
    }

    public static boolean canInsert(String a, String b) {
        int p1 = 0, p2 = 0;
        boolean inserted = false;
        while (p1 < a.length() && p2 < b.length()) {
            if (a.charAt(p1) != b.charAt(p2)) {
                if (inserted) {
                    return false;
                }
                p2++;
            } else {
                p1++;
                p2++;
            }
        }
        return true;
    }
}
