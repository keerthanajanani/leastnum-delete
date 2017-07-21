# leastnum-delete
import java.io.*;
import java.util.*;
public class leastnum delete
{
public static void main(String args[])throws IOException
{
int n,m,l,p,result=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
m=Integer.toString(n).length();
String s=n.toString();
System.out.println("How many digits you want to delete:");
l=Integer.parseInt(br.readLine());
String s1=s.substring((m-l),m);
String s2=s.substring(0,(m-l));
p=Integer.parseInt(s2);
result=p-1;
System.out.println(result);
}
}
