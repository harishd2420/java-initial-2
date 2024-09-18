import java.util.Scanner;
public class palindro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem;
        int b=0;
        int t=a;
        while(a>0){
            rem=a%10;
            b=(b*10)+rem;
            a=a/10;
        }
        if(t==b){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palaindrome");
        }
    }
    
}
