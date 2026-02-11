import java.util.Scanner;

class demo{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("Enter the 1st number: "+a);
        int b=scn.nextInt();
        System.out.println("Enter the 2nd number: "+b);
        
        if(a>b)
        {
            System.out.println(a+"is greater than "+b);
        }
        else
        {
            System.out.println(a+" is not greater than "+b);
        }
    }
}
