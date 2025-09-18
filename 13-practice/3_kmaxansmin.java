import java.util.Arrays;
class kamxmin {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {7, 10, 4, 3, 20, 15};
        for (int j = 0; j < arr.length-1 ; j++){
        for (int i = 0; i < arr.length-1 ; i++){
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("min_value: "+arr[k-1] );
    System.out.println("max_value: "+arr[arr.length-(k)] );
    }
}
