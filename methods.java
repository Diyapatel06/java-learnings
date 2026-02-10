import java.util.Scanner;
//no return no parameter
class example1{
    void hello(){
        System.out.println("Hello");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        example1 obj=new example1();
        obj.add(10,50); 
    }
}

//with retun and no parameter
class example2{
    int getNumber(){
        return 10;
    }
    public static void main(String[] args){
        example2 obj=new example2();
        int result=obj.getNumber();
        System.out.println(result);
    }
}

//static and instance methods
class example3{
    static void staticMethod(){
        System.out.println("I'm static");
    }
    void instanceMethod(){
        System.out.println("i'm instance");
    }
    public static void main(String[] args){
        staticMethod();
        example3 obj=new example3();
        obj.instanceMethod();
    }
}

//user input
class example4{
    void greet(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=scn.nextLine();
        example4 obj=new example4();
        obj.greet(name);
    }
}
