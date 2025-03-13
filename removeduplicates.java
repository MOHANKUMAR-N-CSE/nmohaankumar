import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int s=arr.length;
        int[]temp=new int[s];
        int index=0;
        for(int i=0;i<s-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[index++]=arr[i];
                
            }
        }
            temp[index++]=arr[s-1];
            for(int i=0;i<index;i++){
            System.out.print(temp[i]+" ");
            }
        
    }
}
