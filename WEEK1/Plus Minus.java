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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int c=0;
        int  k=0;
        int b=0;
        float g=arr.size();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>0){
            c=c+1;
        }
        if(arr.get(i)<0){
            k=k+1;
        }
        if(arr.get(i)==0){
            b=b+1;
        }
    }
    
    double l,m,n =0;
       l=c/g;
       m=k/g;
       n=b/g;
       System.out.format("%.6f%n",l);
       System.out.format("%.6f%n",m);
       System.out.format("%.6f%n",n);

    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
