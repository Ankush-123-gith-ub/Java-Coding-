import java.util.Arrays;
class minmax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, -2};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        // int min = arr[0];
        // int max = arr[0];
        // for(int i = 0 ; i < arr.length ; i++ ){
        //    if(arr[i] < min){
        //     min = arr[i];
        //    }
        // }
        // for(int i = 0 ; i < arr.length ; i++ ){
        //    if(arr[i] > max){
        //     max = arr[i];
        //    }
        // }
        System.out.println(min+","+max);
       
        
    }
}
