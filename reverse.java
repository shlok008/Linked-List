package linked_list;
class reverse
{
    public node rev(node head)
    {
        node next=head;
        node temp=head;
        head=null;
        while(next!=null)
        {
            next=temp.n;
            temp.n=head;
            head=temp;
            temp=next;
        }
        return head;
    }
}
        
            
            
        
