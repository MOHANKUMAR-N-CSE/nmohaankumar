import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int res=divArray(arr,s);
        if(res==0){
            System.out.println("balanced");
        }
        else{
            System.out.println(res);
        }
    }
    public static int divArray(int[]arr,int n){
        int half=n/2;
        int ls=0,rs=0;
        for(int i=0;i<half;i++){
            ls+=arr[i];
        }
        for(int i=half;i<n;i++){
            rs+=arr[i];
        }
        if(ls==rs){
            return 0;
        }
        else{
            return Math.abs(ls-rs);
        }
    }
}
