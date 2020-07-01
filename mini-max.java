import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
int x=0;    
long y=0,z=0;   
for(int j=0;j<arr.length-1;j++)
for(int i=0;i<arr.length-1;i++){

    
            if(arr[i]>arr[i+1]){
                x=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=x;
            }
}
for(int i=0;i<arr.length-1;i++){
    y+=arr[i];
}
for(int i=arr.length-1;i>0;i--){
    z+=arr[i];
}
    System.out.println(y+" "+z);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
