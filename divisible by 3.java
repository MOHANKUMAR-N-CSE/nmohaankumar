import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int count=0;
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
