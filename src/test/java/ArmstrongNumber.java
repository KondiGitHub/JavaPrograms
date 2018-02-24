package test.java;

public class ArmstrongNumber {

    public static void main(String[] args ){
        long numbersRange= 10000000;
        int totaArmstringCount =0;
        long n = 6;


        while(numbersRange>10) {
            long cube =0;
            long temp = n;
            while(n>0) {
                long r = n%10;
                cube = cube + (r*r*r);
                n = n/10;

            }
            if(cube == temp){
                System.out.print(" "+ temp);
                totaArmstringCount++;
            }
            numbersRange--;
            n = temp;
            n++;

        }
        System.out.println("\ntotalPrimeNumberCount is :: "+ totaArmstringCount);
    }
}
