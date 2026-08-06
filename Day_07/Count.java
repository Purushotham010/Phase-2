import java.util.*;
class Count {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        int  u = 0, i = 0,n=0,sp=0;
        for (char c: s.toCharArray()){
            if (Character.isUpperCase(c)){
                u++;
            }else if(Character.isLowerCase(c)){
                i++;
            }else if(Character.isDigit(c)){
                n++;
            }else{
                sp++;
            }
        }
        System.out.println("Capital: "+u);
        System.out.println("Small: "+i);
        System.out.println("Numbers: "+n);
        System.out.println("Space: "+sp);
        System.out.println("Symbol: ");

    }
    
}