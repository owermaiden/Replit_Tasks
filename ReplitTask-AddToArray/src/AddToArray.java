import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {

    public static int[] add_to_r(int[] r,int n) {
        //create new array with one more position.
        int[] newArray = new int[r.length + 1];

        for (int i = 0; i < r.length ; i++){

            newArray[i] = r[i];

        }

        newArray[r.length] = n;
        System.out.println(Arrays.toString(newArray));

        return newArray;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        System.out.println(Arrays.toString(add_to_r(arr, n)));

    }

}
