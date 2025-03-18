import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        if(s>0){
        int ts=0;
        int ls=0;
        for(int i=0;i<s;i++){
            ts+=arr[i];
        }
        for(int i=0;i<s;i++){
            if(ls==(ts-ls-arr[i])){
                System.out.println("Equilbrium:"+i);
            }
            ls+=arr[i];
        }
        }
    }
}
