/**
 * urlify
 */

/*
 * Overall concept
 * We are given a character array that is guartuened to have enough space so
 * that we can do everything inplace
 * We are given the true length so we know when the actual string ends.
 * By using this length + the number of (spaces * 2) (each space in the string
 * will add 2 new characters) we can compute the
 * length of the actual array to find the end (we could also do str.length - 1
 * but this way is cooler)
 * Now we itterate backwards and essentially copy over the array that way. If we
 * see a space we add %20 to the back and otherwise
 * we just copy the character.
 * 
 * Question: Why is there no issue with overriding characters when replacing
 * spaces?
 * 
 * Answer: Let's assume that we overrode some character so now we are at some
 * position n. And we assume character we overrode,
 * for the sake of simplicity, was at n - 1 (could be b4 but doesn't matter).
 * Now once we reach the end of the array, index
 * would be at 0 while i would be = 1. This contradicts the fact that the array
 * is long enough to hold the entire new string
 * and thus does not need to be worried about
 * 
 */

public class urlify {

    public static void url(char[] str, int trueLen) {
        int spaceCount = 0;
        for (int i = 0; i < trueLen; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        int index = trueLen + spaceCount * 2;
        index--;
        for (int i = trueLen - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index] = 0;
                str[index - 1] = 2;
                str[index - 2] = '%';
                index -= 3;
            } else {
                str[index] = str[i];
                index--;
            }
        }
    }

}
