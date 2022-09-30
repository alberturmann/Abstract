import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the variable a");
        a = scanner.nextInt();
        System.out.println("Enter the variable b");
        b = scanner.nextInt();

        int  arr[] = new int [3];
        for (int i=0; i<arr.length; i++) {

            System.out.println("Enter the " +i+ " field of Array ");
            arr[i]=scanner.nextInt();
            //System.out.println("The " +i+ " field of array is " + arr[i]);
        }
        System.out.println("All fields of Array are ");
        for (int x: arr)
        {
            System.out.println(x);
        }

        for(int i = a; i<=b; i++){

        if(i%2==0 && i%5==0) 
        { 

            System.out.println(" The 1 field of Array is "+ arr[0]);
            
        }else if(i%5==0){
            
            System.out.println(" The 2 field of Array is "+ arr[1]);
            
        }else if(i%2==0){

            System.out.println(" The 3 field of Array is "+ arr[2]);
        }
        else {
            System.out.println(i);
        }
    }
        }
   
}
