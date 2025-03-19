import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>set=new HashSet<>();
        int s=sc.nextInt();
       
      //  int key=sc.nextInt();
        for(int i=0;i<s;i++){
            set.add(sc.nextInt());
        }
        int key=sc.nextInt();
        if(set.contains(key))
        {
                System.out.println("true");
                
            }
        else{
             System.out.println("false");
        }
        
    }
}
