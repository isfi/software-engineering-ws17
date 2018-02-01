 import java.io.*;

 public class IllegalTempException extends Exception 
 {
   private double temp;
   public IllegalTempException(double temp)
   {
      this.temp = temp;
   } 
   public double getTemp()
   {
      return temp;
   }
 }
