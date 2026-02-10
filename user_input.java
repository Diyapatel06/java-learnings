import java.lang.System;
import java.util.Scanner;

class user_input_int{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("The value of a is "+a);
    }
}

class user_input_string{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String name=scn.nextLine();
        System.out.println("Hey! My name is "+name);
    }
}

class user_input_float{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        float value=scn.nextFloat();
        System.out.println("The float value is "+value);
    }
}

class add_nums{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1st no.:");
        int a=scn.nextInt();
        System.out.println("Enter 2nd no.:");
        int b=scn.nextInt();
        System.out.println("The sum of these value is ");
        System.out.println(a+b);
    }
}

class user_input_double{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        double value=scn.nextDouble();
        System.out.println("The double value is "+value);
    }
}

class user_input_long{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        long value=scn.nextLong();
        System.out.println("The long value is "+value);
    }
}

class user_input_boolean{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        boolean value=scn.nextBoolean();
        System.out.println("The boolean value is "+value);
    }
}