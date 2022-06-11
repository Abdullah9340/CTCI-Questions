public class stringCompression {

    public static void main(String[] args) {
        String a = "aabcccccaaa";
        String result = stringCompress(a);
        System.out.println(result);
    }

    /*
     * Given a string a compress it as follows
     * aaabbcccaad -> a3b2c3a2d1
     * if a.length() == compressedLength return a
     */
    public static String stringCompress(String a) {
        if (a.length() == 0)
            return a;
        StringBuilder answer = new StringBuilder();
        char prev = a.charAt(0);
        answer.append(a.charAt(0));
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == prev) {
                count++;
            } else {
                answer.append(count);
                count = 1;
                prev = a.charAt(i);
                answer.append(a.charAt(i));
            }
        }
        answer.append(count);
        if (answer.length() >= a.length())
            return a;
        return answer.toString();
    }
}
