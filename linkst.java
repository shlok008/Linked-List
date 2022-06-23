package linked_list;

import java.util.Scanner;
class linkst
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Object o=new Object();
        node start=new node();
        for(int i=0;i<2;++i)
        {
            node temp=new node();
            System.out.print("enter");
            temp.name=sc.next();
            temp.mks=sc.nextInt();
            temp.n=start;
            start=temp;
        }
        node temp=start;
        while(temp!=null)
        {
            System.out.print(temp.name);
            temp=temp.n;
        }
    }
    
}
        