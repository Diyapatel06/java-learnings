class A extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Hey Hello:");
             try {
             Thread.sleep(10);
             } catch (InterruptedException e) {
                  System.out.println(e);
             }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Okay Bye ");
            try {
                Thread.sleep(10);
             } catch (InterruptedException e) {
                  System.out.println(e);
             }
        }
    }
}

class try1{
    public static void main(String[] args){
        A threadA = new A();
        B threadB = new B();
        //for(int i=0;i<3;i++){
         //   System.out.println("hello world!!");
       // }
        //threadA.setPriority(10);
        threadA.start();
        threadB.start();
    }
}
//lambda expression
class try2{
    public static void main(String[] args){
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Hello");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }
}
//After lambda expression i.e after java 8
class try3{
        public static void main(String[] args){
            Runnable r1=() ->{  //lambda expression
                System.out.println("Helloo");
            };
            Thread t1=new Thread(r1);
            t1.start();
        }
}

//race condition
class try4{
    int count=0;
    public void increment(){ //add synchronized here instead of public and ou'll have the same output else diff
        count++;
    }
}
class try5{
    public static void main(String[] args) throws InterruptedException{
        try4 t=new try4();
        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    t.increment();
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    t.increment();
                }
            }
        };
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t.count);
    }
}
