// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/factorial-of-a-number-31-2/problem?isFullScreen=true
// Problem     Recursion - Factorial of a Number 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 09:23 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static int fact(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);    
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=fact(n);
        System.out.print("The factorial of "+n+" is "+x);
        
    }
}
