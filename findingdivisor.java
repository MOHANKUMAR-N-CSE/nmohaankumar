import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int res=findDiv(arr,s);
        System.out.println(res);
    }
    public static int findDiv(int[]arr,int n){
        for(int i=0;i<n;i++){
        int candidate=arr[i];
        boolean isDiv=true;
        for(int j=0;j<n;j++){
            if(arr[j]%candidate!=0){
                isDiv=false;
                break;
                
            }
        }
        if(isDiv){
            return candidate;
        }
    }
    return -1;
}
}
