import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        Set<Integer>Fibo=new HashSet<>();
        int a=0;
        int b=1;
        while(a<=s){
            Fibo.add(a);
            int temp=a+b;
            a=b;
            b=temp;
        }
        for(int i=1;i<=s;i++){
            if(!Fibo.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
