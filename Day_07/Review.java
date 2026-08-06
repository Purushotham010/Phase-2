import java.util.*;
public class Review {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        int index = 0;
        for (int i = 0;i<arr.length;i++){
            int j;
            for(j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    break;
                }
            }
            if (j==i){
                arr[index++] = arr[i];
            }
        }
        sc.close();
        System.out.println("After Review Duplicates: ");
        for (int i = 0; i<index;i++){
            System.out.println(arr[i]);
        }
    }
    
}