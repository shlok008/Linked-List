package linked_list;

import java.util.Scanner;
public class linkstf
{
    node start=new node();
    public void add(String name)
    {
        
        node temp=new node();
        if(temp==null)
        System.out.print("Overflow");
        else
        {
            temp.name=name;
            temp.n=start;
            start=temp;
        }
    }
    public void del()
    {
        if(start==null)
        System.out.print("empty");
        else
        start=start.n;
    }
    public void dis()
    {
        while(start!=null)
        {
            System.out.print(start.name);
            start=start.n;
        }
    }
            
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        linkstf ob=new linkstf();
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
    
 