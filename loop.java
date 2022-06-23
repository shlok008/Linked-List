                                        /*  CHECK GEEK FOR GEEK FOR LOOP DETECTION AND DELETION*/
package linked_list;

import java.util.Scanner;
class loop
{
    public void detect(node head)
    {
        if(head==null)
        ;
        else
        {
            node slow=head;
            node fast=head;
            int flag=0;
            while(fast!=null && fast.n!=null && fast.n.n!=null)
            {
                slow=slow.n;
                fast=fast.n.n;
                if(slow==fast)
                {
                    System.out.println("yes there is a loop");
                    flag=1;                    
                }
                if(flag==1)
                {
                    int loop_length=0;
                    do
                    {
                        fast=fast.n;
                        ++loop_length;
                    }
                    while(fast!=slow);
                    fast=head;
                    slow=head;
                    for(int i=0;i<loop_length;++i)
                    fast=fast.n;
                    
                    slow=slow.n;
                    while(slow!=fast.n)
                    {
                        slow=slow.n;
                        fast=fast.n;
                    }
                    fast.n=null;
                    System.out.println("loop deleted");
                    return;
                }
            }
        }
        System.out.print("no loop");
    }
    public void printList(node Node) 
    { 
        while (Node != null) 
        { 
            System.out.print(Node.name + " "); 
            Node = Node.n; 
        } 
    } 
    public static void main(String[] args) 
    { 
        loop ob=new loop();
        node start=new node();
        start.n=new node();
        start.n.n=new node();
        start.n.n.n=new node();
        start.n.n.n.n=new node();
        start.n.n.n.n.n=new node();
        
        start.name="50"; 
        start.n.name="20"; 
        start.n.n.name="15"; 
        start.n.n.n.name= "4"; 
        start.n.n.n.n.name= "18"; 
  
        start.n.n.n.n.n = start.n.n;
        
        //ob.printList(start);   INFINITE LOOP
        ob.detect(start);
        ob.printList(start); 
    } 
}
              
