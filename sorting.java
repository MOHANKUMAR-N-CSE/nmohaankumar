import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>num=new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        Collections.sort(num);
       
       
       
            System.out.print(num+" ");
        
            Collections.sort(num,Collections.reverseOrder());
            
                System.out.println(num+" ");
                
               
        
    }
}
