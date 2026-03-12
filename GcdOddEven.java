/*
Problem: GCD of Odd and Even Sums

Approach:

We know that:
Sum of first n odd numbers  = n^2
Sum of first n even numbers = n(n + 1)

So we need to compute:
GCD(n^2 , n(n + 1))

Take n as a common factor:

GCD(n^2 , n(n + 1))
= n * GCD(n , n + 1)

Since n and (n + 1) are consecutive numbers,
their GCD is always 1.

Therefore:
n * 1 = n

So the final result is simply n.
*/
public class GcdOddEven {
    public static int gcdOddEven(int n){
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(gcdOddEven(n));
    }
    
}
