class Checking{
    public static void main(String[] args){
        int a = 10, b = 5, c = 3, d = 3;
        if ((a > b) && (c == ++d)){
            System.out.println(a++);
            System.out.println(--b);
            System.out.println(++c);
            System.out.println(d--);
        }
        else{
            System.out.println(a++);
            System.out.println(b);
            System.out.println(++c);
            System.out.println(d);
        }
            
    }
}