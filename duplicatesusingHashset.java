import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int flag=0;
        int[]arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer>hs=new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        for(int num:arr){
            if(!hs.contains(num)){
                flag=1;//System.out.println("true");
                break;
            }
            else{
            flag=2;
            }
        }
        if(flag==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
        
        
