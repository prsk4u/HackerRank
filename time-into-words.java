import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String[] ah={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};


        String s="";
        
        if(m%15!=0){
            if(m>=1 && m<=29){
                if(m==1){
                    s="one minute past "+ah[h-1];
                }else
                    s=ah[m-1]+" minutes past "+ah[h-1];
            }
            if(m>=31 && m<=59){
                if(m==59){
                    s="one minute to "+ah[h];
                }else
                    s=ah[60-m-1]+" minutes to "+ah[h];
            }
        }else{
            if(m==00){
                s=ah[h-1]+" o' clock";
            }
            if(m==15){
                s="quarter past "+ah[h-1];
            }
            if(m==30){
                s="half past "+ah[h-1];
            }
            if(m==45){
                s="quarter to "+ah[h];
            }

        }

        return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
