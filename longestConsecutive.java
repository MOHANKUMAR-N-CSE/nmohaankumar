import java.util.*;
  public class Main{
      public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int s=sc.nextInt();
          int[]arr=new int[s];
          for(int i=0;i<s;i++){
              arr[i]=sc.nextInt();
          }
          int res=conSecutive(arr);
          System.out.print(res);
      }
      public static int conSecutive(int[]arr){
          HashSet<Integer>set=new HashSet<>();
          for(int num:arr){
              set.add(num);
          }
          int longestStreak=0;
          for(int num:arr){
              if(!set.contains(num-1)){
                  int currentnum=num;
                  int currentStreak=1;
                  while(set.contains(currentnum+1)){
                      currentnum++;
                      currentStreak++;
                  }
                  longestStreak=Math.max(longestStreak,currentStreak);
              }
              //return longestStreak;
          }
           return longestStreak;
      }
  }
  
  
