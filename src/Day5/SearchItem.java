package Day5;

public class SearchItem {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int index = getIndex(arr,88);
        System.out.println(index);
    }

    /*
    * 查找指定元素第一次在数组中出现的索引*/

    public static int getIndex(int[] arr, int value) {
        for (int i=0; i < arr.length; i++){
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
