package Day5;


public class Array_Dome3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];  //这是一个二维数组，这个数组与三个以为数组
        System.out.println(arr[0]);   //默认值为null

        arr[0] = new int[3];         //第一个一维数组中可以储存3个int值
        arr[1] = new int[5];
        arr[1] = new int[4];

        System.out.println(arr[0]);  //有地址信息
        //arr = {{1, 3, 2},{1,2},{1,2,3}};
        outputArray(arr);
    }

    public static void outputArray(int[][] arr) {
        for (int i =0;i < arr.length; i++) {
            for (int j = 0;j< arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //输出完一个一维数组后，换行
        }

    }
}
