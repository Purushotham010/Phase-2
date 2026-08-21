class Emp{
    int eno;
    String ename;
    void input(){
        eno=1001;
        ename="XYZ";
    }
    void display(){
        System.out.println("Employee number: "+eno);
        System.out.println("Employee name: "+ename);
    }
}
class Employee{
    public static void main(String args[]){
        Emp e=new Emp();
        e.input();
        e.display();
    }
}