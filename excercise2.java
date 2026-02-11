import java.util.Scanner;
//if a no. is +ve,-ve, or 0
class checknum{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=scn.nextInt();

        if(num>0){
            System.out.println(num+" is positive");
        } else if(num<0){
            System.out.println(num+" is negative");
        } else 
        {
            System.out.println("the number is zero.");
        }
    }
}

//largest of three numbers using if-else
class largestof3{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int a=scn.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=scn.nextInt();
        System.out.println("Enter the 3rd number:");
        int c=scn.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+" is the largest of three");
        } else if(b>=a && b>=c){
            System.out.println(b+" is the largest of three");
        } else{
            System.out.println(c+" is the largest of three");
        }
    }
}

//check for vowels or consonants
class vowelsexe{
    public static void main(String[] args){
        Scanner scn=new.Scanner(System.in);

        System.out.println("Enter a character:");
        char ch=scn.next
    }
}

