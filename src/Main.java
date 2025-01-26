//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1 ,2 , 3 ,4 ,5} ; //15

        System.out.println(sum2(arr , 0 , 0));
    }

    public static int sum (int[] arr , int i ) {

        if(arr.length -1  == i ) {
            return  arr[i];
        }

        return arr[i] + sum(arr , i+1 );
    }

    public static int sum2 (int[] arr , int i , int sum ) {

        if(arr.length == i ) {
            return sum ;
        }

        return  sum2(arr , i+1  , sum + arr[i] );
    }

//    int[] arr = {1 ,2 , 3 ,4 ,5} ; //15

    /*
    sum(arr , 0) => 15
        1 + sum( arr , 1 )
                    (14)
            2+ sum (arr , 2 )
                        (12)
                3 + sum ( arr , 3 )
                            (9)
                    4 + sum ( arr , 4)
                                (5)
                        5+ sum(arr , 5 ) => 5
                                (0)

     */

}