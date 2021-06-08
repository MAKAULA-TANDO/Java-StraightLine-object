/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp_objects;

import java.util.*;
public class MathsAPP_objects {

   public String Pointname;
   public double x;
  public double y;
  public MathsAPP_objects(double x,double y,String Pointname){
      this.x = x;
      this.y =y;
      this.Pointname = Pointname;
  }
  
  public void input_Attributes(){
       Scanner console = new Scanner(System.in); 
            System.out.println("Nceda ufake uququzelelo x: ");
            x = console.nextDouble();
            System.out.println("Nceda ufake uququzelelo y:");
            y = console.nextDouble();
            System.out.println("Nceda ufake igama lendawo :");
            Pointname = console.next();
            
  }
  
      public double Distance()
            {
                 double  x2=0;
                 double y2 = 0;

                double temp1 = Math.pow((x - y), 2);

                double temp2 = Math.pow((x2 - y2), 2);

                double result = Math.sqrt(temp1 + temp2);



                return result;

            }
         public double Reflection1()

            {
                //x-axis ref
                double refX;
                refX = (-1)*(y);
                return refX;

            }


         public double ReflectionII()

            {

                //Y-axis ref
                double refY;
                 refY = (-1)*(x);
                return refY;
            }
      


         public String Quad()

            {
                String quadrant= "";
                if (x > 0 && y > 0){

                    quadrant = (" ilele kwikota yokuqala yokuqala, EMTLA MPUMA.");}



                else if (x < 0 && y > 0){

                    quadrant = (" ilele kwikota yesibini yesibini, EMTLA MPUMA.");}



                else if (x < 0 && y < 0){

                    quadrant= (" ilele kwikota yesithathu, EMZANTSI NTSHONA.");}



                else if (x > 0 && y < 0){

                    quadrant = ( " ilele kwikota yesine, EMZANTSI MPUMA.");}



                else if (x == 0 && y == 0){

                    quadrant = ( "ISIPHAMBUKA");}
                return quadrant;
           
           }
         public void out_results(){
              System.out.println("==========================================================================================================");
            System.out.println("                               Wamkelekile kwi MATHS APP                                                      ");

            System.out.println("===========================================================================================================");
      System.out.println("==========================================================================================================");
               double finalResult = Distance();
                double rflx_X = Reflection1();
                double rflx_Y = ReflectionII();

                System.out.println("*******************************************************************************************************");
                System.out.println("Imbonakalo X-Axis ngu : (" + x + ",  " + rflx_X + ") Kwinqaku :  " + Pointname);

                System.out.println("Imbonakalo Y-Axis ngu : (" + rflx_Y + " , " + y + ") Kwinqaku :  " + Pointname );
                System.out.println("Ifomula yomgca ochanekileyo yile " + "" + "y = " + ((y - 0) / (x - 0) + "x  + " +  y));
               String Quadrant = Quad();
                System.out.println("Ulungelelwaniso lwenqaku: " + "'" +Pointname+ "'" + "" + Quadrant );
                System.out.println("Umgama phakathi konxibelelaniso kwa (" + x+ ","+ y+") kunye ( 0,0) :"  + finalResult);
      System.out.println("***********************************************************************************************");

         }
    
}
