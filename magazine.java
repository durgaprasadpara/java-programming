import java.io.*;
import java.util.*;
class magazine

{

    static boolean canConstruct(String ransomNote, String magazine)
 {

        if (ransomNote==null || ransomNote.length() == 0) return true;
        if (magazine==null || magazine.length() == 0) return false;
        boolean flag=false;
        boolean visited[]=new boolean[magazine.length()];
        Arrays.fill(visited,Boolean.FALSE);
        for(int i=0;i<ransomNote.length();i++)
{
            flag=false;
            for(int j=0;j<magazine.length();j++)
{
                if(ransomNote.charAt(i)==magazine.charAt(j) && !visited[j] )
{
                    visited[j]=true;
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s,s1;
    System.out.print("RansomNote=");
    s=sc.next();
    System.out.print("Magazine=");
    s1=sc.next();
    System.out.println(canConstruct(s,s1));

}
}
