import java.util.Scanner;
class Even{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No");
        int a=sc.nextInt();
        System.out.println("Even="+(a%2==0));
        System.out.println("Odd="+(a%2!=0));

    }
}
