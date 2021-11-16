import java.util.Scanner;
public class IsPos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++){
            arr[i]=inp.nextInt();
        }
        //#2 Your code here
        for (int num : arr){

            System.out.println(isPos(num));

        }



    }

    public static String isPos(int num){
        //#1 your code here
        return num == 0 ? "zero" : num > 0 ? "positive" : "negative";


    }
}
