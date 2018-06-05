package Day5;

public class SearchArray {
    public static void main(String[] args) {
        System.out.println("星期"+ getWeek(2));
    }

    public static char getWeek (int week) {
        char[] arr = {' ','一','二','三','四','五','六','日'};

        return arr[week];
    }


}
