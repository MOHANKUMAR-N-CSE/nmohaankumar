import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]main=new int[m];
        for(int i=0;i<m;i++){
            main[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int[]sub=new int[s];
        for(int i=0;i<s;i++){
            sub[i]=sc.nextInt();
        }
        if(Subset(main,sub)){
            System.out.println("The array is subarray");
        }
        else{
            System.out.println("not");
        }
        
    }
    public static boolean Subset(int[]main,int[]sub){
        HashSet<Integer>set=new HashSet<>();
        for(int num:main){
            set.add(num);
        }
        for(int num:sub){
            if(!set.contains(num)){
                return false;
            }
        
        }
        return true;
    }
}

