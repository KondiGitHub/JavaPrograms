public class PrimeNumber {

    public static void main(String[] args) {

        int numbersRange= 100000;
        int totalPrimeNumberCount =0;
            int n = 7;
        while(numbersRange>3) {

            int m = n/2;
            boolean flag = false;
            for(int i = 2 ; i<=m ;i++) {
                if(n%i == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false ) {
                    System.out.print(" "+ n);
                totalPrimeNumberCount++;
            }
            numbersRange--;
            n++;
        }
        System.out.println("\ntotalPrimeNumberCount is :: "+ totalPrimeNumberCount);

    }
}
