package sedmica6utorak;

import java.util.Scanner;

public class PackageTest {
public static void main(String[] args) {
	Package paket= new Package();
	Scanner in=new Scanner(System.in);
	float weight=in.nextFloat();
	float price=3*weight;
	paket.setPrice(price);
	System.out.println("Price:"+price);
	
}
}
