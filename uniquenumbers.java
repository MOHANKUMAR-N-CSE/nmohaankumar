import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=0;
        for(int i=0;i<s;i++){
            int num=sc.nextInt();
            String str=String.valueOf(num);
            Set<Character>digits=new HashSet<>();
            boolean unique=true;
            for(char digit:str.toCharArray()){
                if(digits.contains(digit)){
                    unique=false;
                    break;
                    
                    
                }
                digits.add(digit);
            }
            if(unique)
            {
                c++;
            }
            
            
        }
        System.out.print(c);
    }
}
