import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn =new Scanner(System.in);
        int length=scn.nextInt();
        int  breath=scn.nextInt();
        System.out.println(length*breath);
        System.out.println(2*(length+breath));
        
    }
}