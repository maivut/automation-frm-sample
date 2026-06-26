package sample;

import com.sample.types.StringClass;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MainTest {
    @Test
    public static void testMain(){
        System.out.println("Hello");
    }

    @Test
    public void reverseStringByWordBuilder(){
        String s = "This is String test";
        String[] arr = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
            reverse.append(arr[i]);
            if (i>0) reverse.append(" ");
        }
        System.out.println(reverse);
    }

    @Test
    public void reverseStringByWord(){
        StringClass s = new StringClass();
        s.reverseStringByWord();
    }

}
