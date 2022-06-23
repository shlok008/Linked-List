package linked_list;

import java.util.Scanner;
class dlinked
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dnode start=new dnode();
        dnode temp=start;
        dnode save=start;
        while(true)
        {
            System.out.print("enter");
            temp.name=sc.nextLine();
            if(temp.name.equalsIgnoreCase("shlok"))
            break;
            temp.r=new dnode();
            save=temp;
            temp=temp.r;
            temp.l=save;
        }
        temp=start;
        while(temp!=null)
        {
            System.out.println(temp.l+" "+temp.name+" "+temp.r);
            temp=temp.r;
        }
    }
}