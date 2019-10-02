class Heap
{

    Integer size=0;
    Integer buffer=0;
    
    Object[] A;

    Heap(Integer k)
    {
            buffer=k;
          A=new Object[buffer];
    }

    void BuildMaxHeap(Object[] A,Integer size)
    {
        for(Integer i=size/2;i>0;i--)
        {
            Heapify(A,i,size);
        }   
    }

    void Heapify(Object[] A,Integer n,Integer size)
    {   
        Integer max=n;   

        if( (2*n) <=size  &&  (Integer)A[2*n] > (Integer)A[max] )
        {
            max=2*n;
        }

        if(  ((2*n)+1) <=size && (Integer)A[(2*n)+1] > (Integer)A[max] )
        {
            max=(2*n)+1;
        }

        if(max!=n)
        {
            exchange(A,max,n);

            Heapify(A,max,size);
        }
    }

    
        void exchange(Object[] A,Integer x,Integer y)
        {

            Object temp=A[x];
            A[x]=A[y];
            A[y]=temp;

        }

}
