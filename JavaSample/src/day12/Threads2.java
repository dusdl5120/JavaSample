package day12;

public class Threads2 
{
   static String data=""; //���ڸ� ���� ����
   
   public static void main(String[] args) 
   {
      // TODO Auto-generated method stub
      MyTread  m1 = new MyTread();
      Thread m2 = new Thread(new MyTread4());
      m1.start(); 									 //start�� �Ѵٽ���  
      												 //run�� run ����  ���ϰ� main ���� 
      m2.start();
      m1.setPriority(10);
      m2.setPriority(1);
      
   }

}
class MyTread3 extends Thread
{
   public void run() 
   {
      // TODO Auto-generated method stub
      for(int i= 0; i <10 ; i++)
      {
         
         System.out.print("-");
      
         try 
         {
            /*if(Main.data.compareTo("q")==0) //q�̸� ����� static�̶� (Main.data�̷������� �ҷ��ش�)
            break;*/
            
            
            
            Thread.sleep(1000);
            
         }
         catch (Exception e)
         {
            e.printStackTrace();
         }
      }
   }
}
class MyTread4 implements Runnable
{

   @Override
   public void run() 
   {
      // TODO Auto-generated method stub
      for(int i= 0; i <100 ; i++)
      {
         try 
         {
            
            System.out.print("|");
            Thread.sleep(1000);
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
      }
   }
   
}