public class Palindrome {

    public static void main(String[] args) {

        int numbersRange= 10000000;
        int totalPalindromeCount =0;
        int n = 11;


        while(numbersRange>10) {
            int sum =0;
            int temp = n;
            while(n>0) {
                int r = n%10;
                sum = (sum*10)+r;
                n = n/10;

            }
            if(sum == temp){
                System.out.print(" "+ temp);
                totalPalindromeCount++;
            }
            numbersRange--;
            n = temp;
            n++;

        }
        System.out.println("\ntotalPrimeNumberCount is :: "+ totalPalindromeCount);
    }
}
