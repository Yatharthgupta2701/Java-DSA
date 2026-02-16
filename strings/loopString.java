package strings;
import java.util.*;
public class loopString {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str = "Yatharth Gupta";
        printLetters(str);
    }
}
