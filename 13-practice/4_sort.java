import java.util.Arrays;
class sort {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
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
    }
}
