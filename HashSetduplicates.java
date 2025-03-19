import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         HashSet<Integer>list=new HashSet<>();
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            int n=sc.nextInt();
            list.add(n);
            
        }
        ArrayList<Integer>l=new ArrayList<>(list);
        Collections.sort(l);
        System.out.print(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.print(l);
       // HashSet<Integer>list=new HashSet<>();
       
        
        
    }
}
