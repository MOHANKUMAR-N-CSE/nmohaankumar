import java.util.*;
public class Main{
    public static void main(String[]abs){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sum=0;
        int[]arr=new int[s-1];
        for(int i=0;i<s-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int totalsum=s*(s+1)/2;
        int missingnumber=totalsum-sum;
        System.out.println(missingnumber);
    }
}
