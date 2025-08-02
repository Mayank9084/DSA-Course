import java.util.Scanner;
class Odd_even_using_bit{
    // Bitwise operators are extremely fast and efficient because
    // they operate directly at the binary level,
    // making them significantly faster than arithmetic or logical operations.
    public static boolean isEven(int n)
    {
        // taking bitwise and of n with 1
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if (isEven(n) == true)
            System.out.print("true it is even");
        else
            System.out.print("false");
    }
}
