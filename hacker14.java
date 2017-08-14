import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker14 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        long req1=0,req2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j){
                    req1 += a[i][j];
                    req2 += a[i][n-1-j];
                }
            }
        }
        System.out.println(Math.abs(req1-req2));
    }
}
