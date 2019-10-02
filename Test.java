import java.util.*;
public class Test{
                        public static void main(String args[])
                        {
                            Random digit=new Random();
                            int num,temp;
                            int[] a;
                            a=new int[1000];
                            for(int i=0;i<999;++i)
                            {
                                num=999+digit.nextInt(9999);
                                a[i]=num;
                            }
                            
                            //sort
                            long lStartTime;
                             lStartTime = System.nanoTime();
 
                            for (int k=0;k<=998;k++)
                                 {
                                for (int i=0;i<=998-k;i++)
                                 {
                                 if (a[i]>a[i+1])
                                    {
        
                                         temp = a[i];
                                         a[i]=a[i+1];
                                         a[i+1]=temp;
                                    }

                                }      
                                } 
                                for(int j=0;j<999;++j)
                               System.out.println(a[j]);
                                long lEndTime;
 lEndTime= System.nanoTime();
 long output= lEndTime -lStartTime;
 System.out.println(output); 
                        }
}
