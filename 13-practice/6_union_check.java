import java.util.*;
import java.util.Arrays;
class union_check {
    public static void main(String[] args) {
        Set<Integer> arr1  = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        Set<Integer> arr2  = new HashSet<>(Arrays.asList(2, 3, 5, 6));
        Set<Integer> union  = new HashSet<>(arr1);
        Set<Integer> intersection  = new HashSet<>(arr1);
        union.addAll(arr2);
        intersection.retainAll(arr2);
        System.out.println("the union is: "+union);
        System.out.println("the intersection is: "+intersection);

        
        
        
       

    }
}
