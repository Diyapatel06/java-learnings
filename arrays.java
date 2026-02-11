class array1D{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
class arrayEnhanced{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        int sum=0;
        for(int num : numbers){
            sum=sum+num;
            //System.out.println(num);
        }
        System.out.println("Sum: "+sum);
    }
}

class arraymax{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        int max=0;
        for(int num : numbers){
            if(num>max){
                max=num;
            }
            //System.out.println(num);
        }
        System.out.println("Max: "+max);
    }
}

class arraymin{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        int min=1000000;
        for(int num : numbers){
            if(num<min){
                min=num;
            }
            //System.out.println(num);
        }
        System.out.println("Min: "+min);
    }
}

class element1{
    public static void main(String args[]){
        int[] a={1,2,3};

        System.out.println(a[0]);
    }
}

class element2{
    public static void main(String args[]){
        int[][] a={{1,2,3},{4,5,6}};

        System.out.println(a[0][0]);
    }
}

class jaggedstaircase{
    public static void main(String[] args){
        int n=5;
        int[][] staircase=new int[n][];

        for(int i=0;i<n;i++){
            staircase[i]=new int[i+1];
            for(int j=0;j<=i;j++){
                staircase [i][j]=j+1;
            }
        }

        System.out.println("Staircase pattern:");
        for(int i=0;i<n;i++){
            for(int j=0;j<staircase[i].length;j++){
                System.out.print(staircase[i][j]+" ");
            }
            System.out.println();
        }
    }
}
