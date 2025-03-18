import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c1=0,c2=0,c3=0;
        for(int i=0;i<s;i++){
            int arr=sc.nextInt();
            if(arr==1)c1++;
            if(arr==2)c2++;
            if(arr==3)c3++;
        }
        if((c1>=c2)&&(c1>=c3))
        System.out.println("1");
        else if((c2>=c1)&&(c2>=c3))
        System.out.print("2");
        else
        System.out.print("3");
    }
}
