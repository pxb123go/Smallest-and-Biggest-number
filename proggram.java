import java.util.Scanner;

class proggram{
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int max=0;
        int min=0;
        char choice;
        do{
            System.out.println("Enter any number");
            int a=sc.nextInt();
            if(a>max){
              max=a;
            }
            if(a<min){
                min=a;
              }
              System.out.println("Do you want to continue?");
              choice=sc.next().charAt(0);
        }
        while(choice=='y' || choice=='Y');
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
    }
}