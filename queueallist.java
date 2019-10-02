class Queueal<D> implements Queue<D>
{
    Integer front,rear,buffer;
    Object a[];
    Queueal()
    {
        front=-1;
        rear=-1;
        buffer=5;
        a=new Object[buffer];
    }
    public void enqueue(D o)
    {
        if(rear==(buffer-1))
        {
            Object a2[]=new Object[buffer*2];
            buffer*=2;
            for(Integer j=front;j<rear;++j)
                a2[j]=a[j]; 
            a=a2;
            a[++rear]=o;
        }
        else
        {
            if(front==-1)
            front=0;
            a[++rear]=o;
        }
    }
    public D dequeue()
    {
        try
        {
            if(front==-1)
            {
                BoundsException ob=new BoundsException();
                throw ob;
            }
        }
        catch(BoundsException x)
        {
            x.printError();
            return null;
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        return (D)a[front++];
    }
    public Integer Size()
    {
        Integer c=0;
        for(Integer i=front;i<=rear;++i)
        ++c;
        return c;
    }
}
