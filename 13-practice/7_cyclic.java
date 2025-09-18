import java.util.Arrays;
class cyclic {
    public static void main(String[] args) {
        int rotation = 1;
        int[] arr = {1, 2, 3, 4, 5};
        int[] newarr = new int[arr.length];
        newarr[0] = arr[arr.length-1]; 
        for(int i = 0 ; i < arr.length-rotation ; i++){
            newarr[i+rotation] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
