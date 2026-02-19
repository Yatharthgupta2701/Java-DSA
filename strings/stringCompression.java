package strings;
import java.util.*;
public class stringCompression {

    public static String compress(String str){
        StringBuilder Newstr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            Newstr.append(str.charAt(i));
            if(count > 1){
                Newstr.append(count.toString());
            }
        }
        return Newstr.toString();
    }
    public static void main(String args[]){
        String str = "aaabbbbcc";
        System.out.println(compress(str));
    }
}
