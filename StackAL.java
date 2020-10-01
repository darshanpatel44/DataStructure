class StackAL<D> implements Stack<D>
{

Integer buffer=0;
Integer size=0;

Object arr[];

	StackAL(Integer b)
	{
		buffer=b;
		arr=new Object[buffer];
	}

		public void push(D o)
		{
						
			
			if(size==buffer)
			{
				buffer=buffer*2;
				
				Object arr2[]=new Object[buffer];
				
				for(Integer i=0;i<size;i++)
				{
				
					arr2[i]=arr[i];
				
				}
			
				arr=arr2;
			

			}

			arr[size]=o;
			size++;

		}


		public D pop()
		{
		
			try
			{
			
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
		
			Object temp=arr[size-1];
		
			arr[size-1]=null;
			size--;
		
			return (D)temp;
		}


		public D peek()
		{
		
			try
			{
			
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
		
			return (D) arr[size-1];
		
		}
		
		
}
