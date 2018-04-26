package day12;

public class Threads2 
{
   static String data=""; //문자를 받을 변수
   
   public static void main(String[] args) 
   {
      // TODO Auto-generated method stub
      MyTread  m1 = new MyTread();
      Thread m2 = new Thread(new MyTread4());
      m1.start(); 									 //start는 둘다실행  
      												 //run은 run 실행  다하고 main 실행 
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
            /*if(Main.data.compareTo("q")==0) //q이면 멈춘다 static이라서 (Main.data이런식으로 불러준다)
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