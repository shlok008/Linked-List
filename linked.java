package linked_list;

import java.util.Scanner;
class linked
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        node start=new node();
        node temp=start;
        while(true)
        {
            System.out.print("enter");
            temp.name=sc.next();
            temp.mks=sc.nextInt();
            temp.n=new node();
            if(temp.name.equalsIgnoreCase("shlok")&&(temp.mks==-1))
            break;
            temp=temp.n;
        }
        temp.n=null;
        temp=start;
        while(temp!=null)
        {
            System.out.println(temp.name+" "+temp.mks+" "+temp.n);
            temp=temp.n;
        }
    }
}