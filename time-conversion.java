import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        StringBuffer sb=new StringBuffer(s);
        if(s.charAt(8)=='P'){
            Integer x=Integer.parseInt(s.substring(0,2));
            if(x!=12){
            x+=12;
            }
            sb.replace(0,2,x.toString());
            sb.delete(8,10);
        }
        else{
            Integer x=Integer.parseInt(s.substring(0,2));
            if(x==12){
            sb.replace(0,2,"00");
            }
            
            sb.delete(8,10);
        }
        return sb.toString();

        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
