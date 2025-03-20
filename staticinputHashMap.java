import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //int s=sc.nextInt();
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Alice",26);
        map.put("b",20);
        map.put("a",14);
        String name="bob";
        if(map.containsKey(name)){
            int age=map.get(name);
            System.out.print(name+ " "+age);
        }
        System.out.println("no data found");
        
        }
}
    
