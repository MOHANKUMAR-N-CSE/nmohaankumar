import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int sa=s.length();
        int s2=s1.length();
        if(sa==s2){
            char[]arr=s.toCharArray();
            char[]arr1=s1.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if(Arrays.equals(arr,arr1)){
                System.out.println("anagram");
            }
            else{
                System.out.println("not");
            }
        }
    }
}
