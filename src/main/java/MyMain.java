import java.util.Arrays;
public class MyMain {
    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int size = arr.length;
        int half = size/2;
        int [] arr_1 = new int [half];
        int [] arr_2 = new int [half];
        for (int i = 0; i < half; i++) {
            arr_1[i] = arr[i];
        }
        for (int i = half; i < size; i++) {
            arr_2[i-half] = arr[i];
        }

        for ( int i = 0; i < half; i++) {
            arr[i*2] = arr_1[i];
            arr[i*2+1] = arr_2[i];
        }
        return arr;

    }   
    //Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for (int i = 0; i < arr.length; i++) {
            int y = arr[i];
            int x = (int) (Math.random() * 10);
            arr[i] = arr[x];
            arr[x] = y;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        System.out.println(Arrays.toString(perfectShuffle(arr)));
        System.out.println(Arrays.toString(selectionShuffle(arr)));
        
    }
}