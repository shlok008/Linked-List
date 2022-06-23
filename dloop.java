package linked_list;

import java.util.Scanner;
class dloop
{
    public void detect(dnode start)
    {
        dnode slow=start;
        dnode fast=start;
        while(fast!=null && fast.r!=null && fast.r.r!=null)
        {
            slow=slow.r;
            fast=fast.r.r;
            if(slow==fast)
            {
                System.out.print("yes");
                System.exit(0);
            }
        }
        System.out.print("no");
    }
}
              
