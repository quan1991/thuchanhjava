import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);	
	
		 int luaChon;
		
 do { 
	  do{
		  System.out.println("~~~~~~~~~~~~Mennu : cac chuong trinh thuc hien~~~~~~~~~~~~~~");
		 
			  System.out.println("         1: + giai phuong trinh bac nhat!");
			  System.out.println("         2: + giai phuong trinh bac hai!");
			  System.out.println("         3: + tinh tien dien!");
			  System.out.println("         4: + huy chon!");
			  System.out.print("Moi ban chon: ");
			  luaChon = scanner.nextInt();
		switch(luaChon){
		    case 1:
			Lad2Bai1.main(args);
			break;
		    case 2:
			LabBai2.main(args);
			break;
		    case 3:
			Lab2Bai3.main(args);
		     break;
		    case 4:
            System.out.println("ban da huy chon!");
            break;
		    }
		    System.out.println("              chuong tring ket thuc");
	    } 
	    while(luaChon < 1||luaChon >5);
 
   }
    while(luaChon == 1||luaChon == 5);
}}
 

 
	
