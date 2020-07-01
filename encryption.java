import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        StringBuffer sb=new StringBuffer();
        double ax=Math.sqrt(s.length());
        int i=(int)Math.ceil(ax);
        int j=(int)Math.floor(ax),k=0,l=0,m=0;
        if((i*j)<s.length()){
            j=i;
        }
        char a[][]=new char[j][i];//[3][4]
        while(k<s.length()){
            a[l][m]=s.charAt(k);
            m++;
            k++;
            if(k%i==0){
            l++;
            m=0;
            }
        }  
        for(l=0;l<i;l++){
            for(m=0;m<j;m++){
                if(a[m][l]=='\u0000'){
                    continue;
                }
                sb.append(a[m][l]);
            }
            sb.append(" ");
        }

        return sb.toString();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
