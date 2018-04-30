import java.util.Scanner;

public class Lad1Bai1 {






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bui dang Quan: ");
		
System.out.print("Toan: ");
     try{
     double Toan = scanner.nextDouble();
     System.out.println("ban da nhap dung");
     }
     catch( Exception ex){
    	 System.out.println("moi ban nhap so");
     }
     double Toan = scanner.nextDouble();
System.out.print("Hoa:  ");
     try {
	double Hoa = scanner.nextDouble();
	System.out.println("Ban da nhap dung!");
    }
    catch (Exception ex){
	System.out.println("moi ban nnhap so");
    }
     double Hoa = scanner.nextDouble();
System.out.print("Sinh:  "); 
    try{
    double Sinh = scanner.nextDouble();
     System.out.println("ban da nhap dung");
     }
	catch(Exception ex){
		System.out.println("moi ban nhap so");
	 }
    double Sinh = scanner.nextDouble();
double d = (Toan  + Hoa + Sinh)/3;
System.out.println("Trung binh ba mon: " + d);
System.out.print("Xep Loai: "); 

if (d >= 9){
	System.out.println("Loai Gioi");
    }
	if(d < 9){
		if(d >= 6.5)
		System.out.println("Loai Kha");
	     }
	if (d < 6.5){
		if(d > 4){
		System.out.println("Trung binh");
	    }
		else {
			System.out.println("Loai yeu");
			
      }

    }
	
	}
}
