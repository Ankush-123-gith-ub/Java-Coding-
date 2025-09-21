import java.util.Arrays;
class reverse_arr{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newarr = new int[arr.length];
        int c =0;
        for (int i = arr.length-1 ; i >=0 ; i--){
            newarr[c]=(arr[i]);
            c++;
        }
        // for (int i = 0 ; i <arr.length ; i++){
        //     System.out.println(newarr[i]);
        // }
        System.out.println(Arrays.toString(newarr));

    }
}