import java.util.*;
 
public class Palindrome
{
    public static void main(String args[]){
        int num,tNum,sum;
         
        Scanner bf=new Scanner(System.in);
         
      
        System.out.print("Enter any integer number: ");
        num= bf.nextInt();
         
        
        tNum=num;
        sum =0;
        while(tNum>0)
        {
            sum = (sum*10) + (tNum%10);
            tNum/=10;
        }
         
        
        if(num==sum)
            System.out.println(num + " is a Palindrome Number.");
        else
            System.out.println(num + " is not a Palindrome Number.");
    }
}