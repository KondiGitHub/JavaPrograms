package sorting;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        int size = arr.length;

        for(int i = 0; i<size-1;i++) {
            int index = i;
            for(int j = i+1 ;j<size;j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallNumer = arr[index];
            arr[index] = arr[i];
            arr[i] = smallNumer;
        }

    }

    public static void main(String[] args)
    {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }


    }
}
