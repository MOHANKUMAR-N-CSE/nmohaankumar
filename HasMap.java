import java.util.*;
  public class Main{
      public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
         HashMap<String,Integer>map=new HashMap<>();
         int n=sc.nextInt();
         sc.nextLine();
         for(int i=0;i<n;i++){
              String s=sc.nextLine();
             int age=sc.nextInt();
             //String s=sc.nextLine();
             sc.nextLine();
             map.put(s,age);
         }
         String searchName=sc.nextLine();
         if(map.containsKey(searchName)){
           // map.get(searchName);
            System.out.print(searchName+"is" +map.get(searchName));
         }
      }
  }
