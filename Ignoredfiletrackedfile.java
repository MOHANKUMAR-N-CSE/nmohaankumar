import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int s1=sc.nextInt();
        Set<Integer>num=new HashSet<>();
            for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        
        Set<Integer>num1=new HashSet<>();
            for(int i=0;i<s1;i++){
                num1.add(sc.nextInt());
            }
        
        int count=0;
        for(int numm:num){
            if(num1.contains(numm)){
                count++;
            }
            
        }
        int count1=0;
        for(int i=1;i<s;i++){
            if((!num1.contains(i)&&!num.contains(i))){
                count1++;
            }
        }
        System.out.print(count+" "+count1);
    }
}
    


