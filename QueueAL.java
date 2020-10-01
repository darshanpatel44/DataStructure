import java.util.*;

class QueueAL<D> implements Queue<D>
{

    Integer size=0;
    Integer buffer=10;



    Object arr[]=new Object[buffer];


    public void add(D o)
    {
        if(size==0)
        {
            arr[0]=o;
            size++;
        }
    

        else if(size==buffer)
            {
                buffer=buffer*2;

                Object arr2[]=new Object[buffer];

                for(Integer i=0;i<size;i++)
                {
                    arr2[i]=arr[i];
                }
            
                arr=arr2;
            }
            
            else
            {
            arr[size]=o;
            size++;
            }

        }
        
        public D peek ()
        {

            try{

                if(size<=0)
               {
                BoundsException ob=new BoundsException();
                throw ob;
               }
            }

            catch(BoundsException ob)
            {

                ob.printError();
                return null;

            }

            return (D)(arr[0]);

        }


        public D remove()
        {

                D temp=null;

            try{

                if(size<=0)
               {
                BoundsException ob=new BoundsException();
                throw ob;
               }
            }

            catch(BoundsException ob)
            {

                ob.printError();
                return null;

            }

            Object arr2[]=new Object[buffer];

                for(Integer i=1;i<=size;i++)
                {
                    arr2[i-1]=arr[i];
                }
            
                temp=(D)arr[0];
                arr=arr2;

                size--;

                return temp;

        } 

        public void traverse()
        {
            for(Integer k=0;k<buffer;k++)
            System.out.println(arr[k]);
        }

        public Integer size()
        {
    
                return size;
    
        }
    
    
    
        
    }
