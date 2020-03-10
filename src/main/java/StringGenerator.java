import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

public class StringGenerator {

    public StringGenerator(){
        //constructor
    }

    public boolean isPalindrome(String str){
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

//    public boolean searchStringPal(int pal){
//
//    }

    public String convertNumbertoString(int pal){
        return pal > 0 && pal < 27 ? String.valueOf((char)(pal + 64)) : null;
    }

    public String generateRandomSring(int count) {
        byte[] array = new byte[count]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    }
    public String reverseString (int boys){
        String reverseMeG = null;
        if (boys % 2 != 0){
            String bound = randomGuide(boys);
            StringBuilder sb = new StringBuilder(bound);
            String generatedString_one = RandomStringUtils.randomAlphabetic(1).toLowerCase();

            String reverseMe = bound + generatedString_one + sb.reverse().toString();
            reverseMeG = reverseMe;
        }
        else {
            String bound = randomGuide(boys);
            StringBuilder sb = new StringBuilder(bound);
            String generatedString_one = RandomStringUtils.randomAlphabetic(1).toLowerCase();
            String reverseMe = bound + sb.reverse().toString();
            reverseMeG = reverseMe;
        }

        return reverseMeG;
    }

    public String randomGuide(int boy){
//        int numberDiv = boy/2;

        String result = null;
        if (boy % 2 == 0){
            int cekj = boy / 2;
            String generatedString = RandomStringUtils.randomAlphabetic(cekj).toLowerCase();
            result = generatedString;
        }
        else {
            int cekj = (boy-1)/2;
            String generatedString = RandomStringUtils.randomAlphabetic(cekj).toLowerCase();
//            String generatedString_one = RandomStringUtils.randomAlphabetic(1).toLowerCase();
//            StringBuilder bd = new StringBuilder(generatedString);
//            String combine = bd.insert(cekj/2, generatedString_one).toString();
            result = generatedString;
        }
        return result;
    }

    public void paliondromeGenerator(int lang){
        String cekMe = reverseString(lang);
        System.out.println(cekMe);
    }
}
