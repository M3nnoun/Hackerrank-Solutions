import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int term=0;
            for (int j = 0; j < n; j++) {
                term+=Math.pow(2, j)*b;
                if (j==0) 
                    term+=a;
                System.out.printf("%d ",term);
                
            }
           System.out.println("");
    }
        in.close();
    }
    
    
}
