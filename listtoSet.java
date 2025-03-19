import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<s;i++){
            l.add(sc.nextInt());
        }
        Set<Integer>set=new HashSet<>(l);
        System.out.println(set);
    }
}
