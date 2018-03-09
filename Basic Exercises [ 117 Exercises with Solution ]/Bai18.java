
import java.util.Scanner;
public class Bai18 {
 public static void main(String[] args)
 {
  long nhiphan1, nhiphan2, multiply = 0;
  int chuso, heso = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Nhap so nhi phan dau tien: ");
  nhiphan1 = in.nextLong();
  System.out.print("Nhap so nhi phan thu hai: ");
  nhiphan2 = in.nextLong();
  while (nhiphan2 != 0)
  {
	  chuso = (int)(nhiphan2 % 10);
   if (chuso == 1) 
   {
	   nhiphan1 = nhiphan1 * heso;
    multiply = kq((int) nhiphan1, (int) multiply);
   } 
   else
   {
	   nhiphan1 = nhiphan1 * heso;
   }
   nhiphan2 = nhiphan2 / 10;
   heso = 10;
  }
  System.out.print("San pham cua hai so nhi phan: " + multiply+"\n");
 }
 static int kq(int binary1, int binary2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }