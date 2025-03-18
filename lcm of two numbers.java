import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int s1=sc.nextInt();
        int res=findgcd(s,s1);
        int lcm=s*s1/res;
        System.out.println(lcm);
    }
    public static int findgcd(int s,int s1){
        if(s1==0)
        return s;
        else{
        return findgcd(s1,s%s1);
        }
    }
}
