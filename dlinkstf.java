package linked_list;

import java.util.Scanner;
class dlinkstf
{
    dnode start=new dnode();
    dnode temp=start;
    dnode save=start;
    public void add(String name)
    {   
        if(temp==null)
        System.out.print("Overflow");
        else
        {
            temp.name=name;
            temp.l=new dnode();
            temp=temp.l;
            temp.r=save;
            save=temp;
        }
    }
    public void del()
    {
        if(temp==null)
        System.out.print("empty");
        else
        temp=temp.r;
        save=temp;
    }
    public void dis()
    {
        while(temp.r!=null)
        {
            temp=temp.r;
            System.out.print(temp.name);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dlinkstf ob=new dlinkstf();
        ob.add("a");
        ob.add("b");
        ob.add("c");
        ob.add("d");
        ob.add("e");
        ob.del();
        ob.del();
        ob.del();
        ob.dis();
    }
}
