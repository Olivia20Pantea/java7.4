package com.company;

public class Main {

    public static void main(String[] args) {
	permutari(3,2);
    }
    private static void permutari(int n , int m){
        System.out.println(factorial(n)/factorial(n-m));
    }
    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n-1);}
}
