import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int val=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==val){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.print(index+" ");
        }
        else{
            System.out.print("-1");
        }
        }
    
}
