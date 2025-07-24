package Strings;

import java.util.Arrays;

public class Anagram {
    public static String sortString(String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        str1 = sortString(str1);
        str2 = sortString(str2);

        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = isAnagram(str1, str2);
        System.out.println("Are the strings \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
    }
}
