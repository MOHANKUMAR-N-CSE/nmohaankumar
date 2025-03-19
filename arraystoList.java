import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
    Integer[]arr=new Integer[s];
    for(int i=0;i<s;i++){
        arr[i]=sc.nextInt();
    }
    List<Integer>num=Arrays.asList(arr);
    System.out.println(num);
    }
}
