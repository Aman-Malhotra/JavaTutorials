import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker11 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int N= in.nextInt();
        int array[]= new int[N];
        for(int x =0;x<N;x++)
            array[x]=in.nextInt();
        for(int count=(array.length-1);count>=0;count--)
            System.out.printf("%s ",array[count] );
    }
}
