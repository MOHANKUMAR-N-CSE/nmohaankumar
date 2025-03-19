import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            
        }
        Arrays.sort(arr);
        for(int i=s-1;i>=0;i--){
            if(arr[i]<0){
                int x=arr[i]*-1;
                for(int j=0;j<s;j++){
                    if(x==arr[j]){
                        System.out.print(arr[i]+" "+arr[j]);
                    }
                }
            }
        }
    }
}
