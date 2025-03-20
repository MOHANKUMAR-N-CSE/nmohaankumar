import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            System.out.println(Product(num));
        }
    }
    public static int Product(int num){
        int product=1;
        while(num>0){
        int rem=num%10;
        product*=rem;
        num=num/10;
    }
    return product;
}
}
