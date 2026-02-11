class ifexamp{
    public static void main(String[] args){
        int age=18;

        if(age>=18){
            System.out.println("You are an adult");
        }
    }
}

class ifelseExamp{
    public static void main(String[] args){
        int num=7;
        
        if(num % 2 ==0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            System.out.println(num+" is odd");
        }
    }
}

class grades{
    public static void main(String[] args){
        int marks=98;

        if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=80){
            System.out.println("Grade B");
        }else if(marks>=70){
            System.out.println("Grade C");
        }else if(marks>=60){
            System.out.println("Grade D");
        }else {
            System.out.println("GRADE E");
        }
        }
}

//LOGICAL STATEMENTS
class logicalOps{
    public static void main(String[] args){
        int age=25;
        boolean hasTicket=true;
        
        if(age>=18 && hasTicket){
            System.out.println("You can enter the movie");
        }

        boolean isWeekend=true;
        boolean isHoliday=false;

        if(isWeekend || isHoliday){
            System.out.println("You can relax!!");
        }
        
        boolean isRaining=false;

        if(!isRaining){
            System.out.println("You don't need an umbrella");
        }
    }
}
