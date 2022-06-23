package linked_list;
import java.util.Scanner;
class merge
{
    static class node
    {
        int data;
        node n;
        
        node(int d)
        {
            data=d;
            n=null;
        }
    }
    static node head1,head2;

    public int count(node head)
    {
        int c=0;
        while(head!=null)
        {
            c++;
            head=head.n;
        }
        return c;
    }
    public int equal(int m,int n)
    {
        if(m>n)
        return intersect(m-n,head1,head2);
        else
        return intersect(n-m,head2,head1);
    }
    public int intersect(int c,node one,node two)
    {
        while(c!=0)
        {
            one=one.n;
            --c;
        }
        while(one.data!=two.data)
        {
            one=one.n;
            two=two.n;
        }
        return one.data;
    }
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        merge ob=new merge();
        
        ob.head1 = new node(3); 
        ob.head1.n = new node(6); 
        ob.head1.n.n = new node(9); 
        ob.head1.n.n.n = new node(15); 
        ob.head1.n.n.n.n = new node(30);
        
        ob.head2 = new node(10); 
        ob.head2.n = new node(15); 
        ob.head2.n.n = new node(30);
        
        int d1=ob.count(head1);
        int d2=ob.count(head2);
        System.out.print(ob.equal(d1,d2));
    }
}
        
    

    
 