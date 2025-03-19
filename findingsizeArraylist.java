import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        ArrayList<Integer>num=new ArrayList<>();
        for(int i=0;i<s;i++){
            num.add(sc.nextInt());
        }
        System.out.println(num.size());
    }
}
