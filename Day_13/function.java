class function {
    static void method(){
        System.out.println("it is in the deafult in side the methos of a static");
    }
    static void method(String Ename){
        System.out.println("it is taking a parament's in the they what we are giving in the method values");
    }
    static void method(String Ename, int id){
        System.out.println("it is taking in tne values of the method of a string and int values :- "+ Ename + " and " + id);
    }
    public static void main(String[] args){
        method();
        method("Sk");
        method("Sk", 001);

    }
}