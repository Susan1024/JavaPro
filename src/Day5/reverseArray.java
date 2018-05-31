package Day5;

public class reverseArray {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        //arrayPrint(arr);
        reverseArray(arr);
        arrayPrint(arr);

    }

    public static void reverseArray (int[] arr) {
        for(int i = 0;i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1- i] = temp;
        }

    }

    public static void arrayPrint (int[] arr) {
        for(int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
