package strings;
import java.util.*;
public class anagram {

    public static boolean isAnagram(String s, String t){
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
