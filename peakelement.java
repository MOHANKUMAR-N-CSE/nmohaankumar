import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int m=0,peak=0;
        for(int i=0;i<s;i++){
            if(arr[i]>m){
                m=arr[i];
                peak=i;
            }
        }
        System.out.print("peak: "+m+ "index: "+peak);
    }
}
