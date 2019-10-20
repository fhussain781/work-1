package constructor;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class mainClass {
	
	public static void main(String[] args) { 
		Scanner poll= new Scanner(System.in);
		int flow = poll.nextInt();
		
		for(int i=1;i<flow;i++) {
		mainClassTest hhth = new mainClassTest();
		mainClassTest math2 = new mainClassTest("BOSS", 1009);
		mainClassTest ccc =new mainClassTest("NIKE", 34);
		
		System.out.println(" PassWORD =");
		ccc.count("D", 2);
		math2.count2();
		hhth.count3(8);
	}
	}
}