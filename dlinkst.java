package linked_list;

import java.util.Scanner;
class dlinkst
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dnode start=new dnode();
        dnode temp=start;
        dnode save=start;
        for(int i=0;i<3;++i)
        {
            temp.name=sc.next();
            temp.l=new dnode();
            
            temp=temp.l;
            temp.r=save;
            save=temp;
        }
        for(int i=0;i<4;++i)
        {
            System.out.println(temp.name);
            temp=temp.r;
        }
        
    }
}

            
 