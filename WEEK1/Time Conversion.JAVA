import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) 
    {
        if(s.substring(0,2).equals("12") && s.substring(8,10).equals("AM"))
        {
            return "00"+s.substring(2,8);
        
        }
        if(s.substring(8,10).equals("AM"))
       {
        return (s.substring(0,8));
        }
        if(s.substring(8,10).equals("PM"))
        {
        String f= s.substring(0,2);
        int g=Integer.parseInt(f);
        if(g==12){
            
          return s.substring(0,8);
         }
          return  12+g+s.substring(2,8);
        
         }
        return s;
       }

    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
