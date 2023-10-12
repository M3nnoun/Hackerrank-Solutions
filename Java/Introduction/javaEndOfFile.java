import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<String> inputs=new ArrayList<String>();
        Scanner s=new Scanner(System.in);
        String line;
        int count=1;
        while(s.hasNext()){
            line=s.nextLine();
            System.out.printf("%d %s\n",count++,line);
        }
    }
}
