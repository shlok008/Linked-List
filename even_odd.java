package linked_list;
import java.util.Scanner;
class even_odd
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        nodee head=new nodee();
        nodee temp=head;
        nodee pre=head;
        nodee flag=head;
        nodee fpre=head;
        //int n=sc.nextInt();
        for(int i=0;i<5;++i)
        {
            temp.n=new nodee();
            temp=temp.n;
            temp.data=sc.nextInt();
        }
        temp=head.n;
        flag=head.n;
        while(temp!=null)
        {
            if(temp.data%2==1)
            {
                while(pre.n!=temp)
                pre=pre.n;
                flag=temp.n;
                while(flag.data%2!=0)
                {
                    flag=flag.n;
                    if(flag==null)
                    {
                        temp=head.n;
                        while(temp!=null)
                        {
                            System.out.print(temp.data);
                            temp=temp.n;
                        }
                        System.exit(0);
                    }
                }
                while(fpre.n!=flag)
                fpre=fpre.n;
                
                fpre.n=fpre.n.n;
                pre.n=flag;
                flag.n=temp;
                
                temp=flag;
                pre=flag;
                fpre=flag;
                
            }
            temp=temp.n;
       }
       temp=head.n;
       while(temp!=null)
       {
           System.out.print(temp.data);
           temp=temp.n;
       }
    }
}