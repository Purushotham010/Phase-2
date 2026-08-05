import java.util.*;
class StringRev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int  i = s.length();
        while(i>0){
            System.out.println(s.charAt(i-1));
            i--;
        }
       
    }

}

