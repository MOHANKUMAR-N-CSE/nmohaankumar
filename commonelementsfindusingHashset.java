import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        
        int s1=sc.nextInt();
        int[]arr1=new int[s1];
        for(int i=0;i<s1;i++){
            arr1[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int i:arr1){
            if(set.contains(i)){
                System.out.println(i+" ");
            }
        }
    }
}
        
        
