import java.util.Arrays;

public class Massiv {
    public static void main(String[] args){
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        String[] arr2 = { "ybbyu", "kmmk", ""};
        System.out.println(arr2.length);
        for(String name : arr2){
            if (name.length() > 3){
                System.out.println(name);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
