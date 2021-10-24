//forCheck
package HomeExtraTaskTwo;

public class CaesarCipher {

    static int countShift = 2;

    public static void main(String[] args) {

        String strForEncrypt = enteredText("Hello world!");
        char[] chForEncrypt = createWords(strForEncrypt);
        swapCharShift(chForEncrypt);
        printCharsArray(chForEncrypt);
    }

    public static char[] createWords(String strForEncrypt) {
        char[] chForEncrypt = strForEncrypt.toCharArray();
        return chForEncrypt;
    }

    private static String enteredText(String strForEncrypt) {
        return strForEncrypt;
    }

    private static void printCharsArray(char[] chForEncrypt) {
        for (int i = 0; i < chForEncrypt.length; i++) {
            System.out.print(chForEncrypt[i]);
        }
    }

    private static void swapCharShift(char[] chForEncrypt) {
        for (int i = 0; i < chForEncrypt.length - countShift; i++) {
            char tmp = chForEncrypt[i];
            chForEncrypt[i] = chForEncrypt[i + countShift];
            chForEncrypt[i + countShift] = tmp;
        }
    }
}

