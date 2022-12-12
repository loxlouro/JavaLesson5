public class Main {
    public static void main(String[] args) {
        int[] array={12, 6, 4, 43, 67,15,10};
        pyramidSorter.heapSort(array);
        for (int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}