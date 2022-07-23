import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int no,fact=1;
        System.out.println("Enetr any number ");
        no=in.nextInt();
        for(int i= 1; i<=no; i++)
        {
            fact= fact*i;
        }
        System.out.println("Factorial of "+no+"is"+fact);
    }
}
