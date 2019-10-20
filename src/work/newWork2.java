package work;


	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;



	public class newWork2{
		//Variable declaration
			static final int xtra3=1000;
					
				static String myName;
				static double[] totalProduct= new double[xtra3];
				static double grossPayAmount;
				static double discountPay;
				static Scanner boss;
				static String []nameOfProduct=new String [xtra3];
				 static int []numberOfProduct=new int[xtra3];;
				static double[] priceOftheProduct=new double[xtra3];
				static int ig;
				static int dope;

		public static void nameACustomer() {
			//in this module a user is able to enter customers name
			System.out.print("Whats your name:(Enter your name)\n My name is  ");
			boss = new Scanner(System.in);
			
			myName= boss.nextLine();
		}
	public static void getProduct() {
		//in this module a user is able to enter product's name
		boolean invalid;
		do {
			try {
		System.out.println("How many products did you buy?");
		boss =new Scanner(System.in);
		dope =boss.nextInt();
		if(dope<=0) {
			System.out.println("invalid");
			invalid=true;
		}else {invalid=false;}
		for ( ig=0; ig<dope;ig++) {
		System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
			System.out.print( "Product: " + (ig+1));
		boss = new Scanner(System.in);
		System.out.println(" (What did you buy today??)\n Product name: ");
		nameOfProduct[ig]= boss.nextLine();
		System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
		System.out.print("Amount??  >>Product Quantity: (Must be a whole number)\n ");
	System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
	
	System.out.print("I got ");
	
	
		numberOfProduct[ig]= boss.nextInt();
	if (numberOfProduct[ig]<=0) {
		invalid=true;
		System.out.println("Invalid input captured!!!!");
		System.out.println("CALL MANAGER!!!\nCALL MANAGER!!!\nCALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		}else {
			invalid=false;
		}
		
	
		System.out.println(" OF ***" + nameOfProduct[ig]);

	System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
	System.out.print("Cost?? >>Product Price: (Must be a  real number)\n");
	System.out.print("$ ");
		priceOftheProduct[ig]= boss.nextDouble();
	if (priceOftheProduct[ig]<=0) {
		invalid=true;
		System.out.println("Invalid input captured!!!!");
		System.out.println("CALL MANAGER!!!\nCALL MANAGER!!!\nCALL MANAGER!!!\nCALL MANAGER!!!\n");
		break;}else {
			invalid=false;
		}
			
	if ((priceOftheProduct[ig]*numberOfProduct[ig])<0) {
		invalid=true;
		System.out.println("Invalid input captured!!!!");
		System.out.println("CALL MANAGER!!!\nCALL MANAGER!!!\nCALL MANAGER!!!\nCALL MANAGER!!!\n");
		break;
	}else if ((priceOftheProduct[ig]*numberOfProduct[ig])>0) {
		invalid=false;
		totalProduct[ig]= numberOfProduct[ig]*priceOftheProduct[ig];
		System.out.print("Your TOTAL~!:$ ?");
		grossPay();
		System.out.println();
	}

		if (ig==(dope-1)) {
		System.out.println("DO You Want to continue Shopping??...(type 'YES' or 'no' to exit)");
		boss = new Scanner(System.in);
		String noT = boss.nextLine();
		if(noT.equals("YES")) {
			System.out.println("Scann Your next Product!)");
			continue;
		}
		else if(noT.equals("no")) {
			
			discountPay();
			displayTable();
	 exitProgram();
	break;
		}
	
	}}}catch (Exception e) { invalid=true;
	System.out.println("NO! RESTART for ERROR~!");
	Choice();}
	
}while(invalid);}


	public static void grossPay() {
		
			
			double x= grossPayAmount+totalProduct[ig];
			grossPayAmount=x; 
	
	}

		
		public static void discountPay() {
			 if (grossPayAmount>0 && grossPayAmount<100) {
				discountPay = grossPayAmount;
				System.out.println("NO DISCOUNT Under $100 ");
			} else if (grossPayAmount>=100 && grossPayAmount<500) {	
				discountPay = (grossPayAmount - 10);
				System.out.println("-$10 DISCOUNT ");
		} else if(grossPayAmount>=500 && grossPayAmount<1000) {
			discountPay = grossPayAmount-20;
			System.out.println("-$20 DISCOUNT ");
		} else if(grossPayAmount>=1000) {
			discountPay= grossPayAmount-30;
			System.out.println("-$30 DISCOUNT ");
		}else if (grossPayAmount<0) {
			System.out.println("Invalid input captured!!!!");
		}
		} 
		public static void welcomeBack() {
			//In this module the customer is greeted.
			do {
			
				System.out.println();
				System.out.println();
				System.out.println();	
			System.out.println('\t'+"\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			for (int i=0; i<10;) {
			System.out.println('\t'+"\t\tcustomer " +(i+1));
			break;}
			System.out.println('\t'+"\t\t            Welcome "+ myName+ "         ");
			System.out.println();
			System.out.println('\t'+"\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("             \t "+"> > > > > >" + "BIG TIKI EMPIRE" + "< < < < < ");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println('\t'+"\t\t               " + "25, Left St"+ "            ");
			System.out.println('\t'+"\t \t	" + "HelloJava, Bangladesh 2019" + "        ");
			System.out.println('\t'+"\t\t            " + "  (508)-$$$-$$$$  " + "        ");
			System.out.println("");
			System.out.println('\t'+"\t  _____________" + "$ALES RECEIPT"+ "______________");
			System.out.println("");
			DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss a");
			Date date = new Date();
			System.out.println("                    Our Checker Today Is");
			System.out.println("                     "+dateFormat.format(date)+"        * Java");
			
			}while(ig==xtra3);
			
			
			}
	public static void displayOutput() {
		
		System.out.println("                    "+"=======================================");
	System.out.println("                    "+"GUEST: " + myName);
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("                    "+"Products "+"              "+ " Price of Products");
	System.out.println();
	for ( int i=0; i<dope;i++) {
	System.out.println("                    "+nameOfProduct[i] + "       "+numberOfProduct[i]+"q X $"+priceOftheProduct[i] );
	System.out.println("                                 $" +"********************"+ totalProduct[i] );
	System.out.println("");
		continue;}
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	//System.out.println("                    "+"Product Total Price:" );
	//System.out.println("                    "+"$" + grossPayAmount);
	System.out.println("                    "+"======================================");
	System.out.println("                    "+"Gross Pay Amount: $ " + grossPayAmount);
	System.out.print("                    "+"Discount: " );
	discountPay();
	System.out.println("");
	System.out.println("                    "+"Discounted TOTAL:$" + (discountPay));
	System.out.println("");
	System.out.println("");
	System.out.println("");
		
	}
	public static void displayOutput2() {
		System.out.println("====================================================");
	System.out.println("Customer Name:: " + myName);
	System.out.println("Product Purchased: "+"                 "+ " Price of Product");
	System.out.println();
	System.out.println(nameOfProduct + "     "+numberOfProduct+"q X $"+priceOftheProduct );
	System.out.println( "  						                                  "+ totalProduct);
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("Product Total Price:" );
	System.out.println("$" + totalProduct );
	System.out.println("====================================================");
	//System.out.println("Gross Pay Amount: " + grossPay2);
	//System.out.println("Discount: $" + ((grossPay2)-discountPay));
	System.out.println("After Discount: " + discountPay);

	}

	public static void exitProgram() {
		System.out.println("                    "+"Answer for the total~!");
		
	}
	public static void exitProgram2() {
		System.out.println();
		System.out.println("                    "+"*> > > Thank You for Shopping < < <*");
		System.out.println("                    "+"------------------------------------------");
		System.out.print("                    "+"Today is ");
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss aa");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		System.out.println("                             "+dateFormat.format(date));
		System.out.println("                             "+dateFormat.format(date));
		System.out.println("");
		System.out.println("");
		System.out.println("                    "+"RULES:");
		System.out.println("                    "+"*_*! NO REFUND OR EXCHANGE!");
		System.out.println("                    "+"$$$ "+"CASH ONLY!");
		System.out.println();
		System.out.println("                    0-0-0-0-0-0-0"+" Go HOME~! "+"0-0-0-0-0-0-0");
		System.out.println("                    -_-_-_-_-_-_-"+"SEE YOU AGAIN~!-_-_-_-_-_-_-");
		System.out.println();
		System.out.println("                    "+"          "+"Have a GREAT DAY~!");
		System.out.println("THE END");
	}
	
	public static void reProgram() {
		for (int i=0; i<10;i++) {
			
			System.out.println("~~~~~~~~" + "Customer : " + (i+1) + "~~~~~~~~");
			
			
			//nameACustomer();
			//getProduct();
			//grossPay();
			//discountPay();
			//Option to continue 
			 String doYouWantToContinue;
				 boss = new Scanner(System.in);
				 System.out.println();
				 System.out.println();
				System.out.println("DO You Want to continue ...(type 'YES' OR 'no' to exit)");
				System.out.println("RESTART??");
				doYouWantToContinue = boss.nextLine();
				
				if (doYouWantToContinue.equals("no")) {
					welcomeBack();
					displayOutput();
			 exitProgram2();
			 break;
					
			} else if (doYouWantToContinue.equals("YES")){
				Choice();
					break;
			}else 
				if(i>=i++){
				break;
			}
						
				
		
		}

		
		
		
	}
public static void displayTable() {
	String c = "\t\t";
	
		System.out.println(c+"Product| \tQuantity | \tPrice | \tTotal");
		
		for(int i=0;i<dope;i++){
			System.out.println(c+nameOfProduct[i] + c+numberOfProduct[i] + c+priceOftheProduct[i] + c+totalProduct[i]  );
	
		continue;}
}

	
	
public static void Choice() {
	boolean noCrash=true;
	do {
		try {
	
	boss = new Scanner(System.in);		
	System.out.println("Please Chose a option\n [(1)READY / (2)Restart / (3)Quit / (4) exit]");
	String answerIs = boss.nextLine();


	// === 
	switch(answerIs) {

	case "1": 
		// Start of the product input
		noCrash = true;
		System.out.println("Thanks For shopping|\n**Follow the instructions .. ");
		
		getProduct();
		discountPay();
		displayOutput();
		
		Choice();  // Recursive Function Call 

	case "2":
		//Restart option
		noCrash = true;
		System.out.println("RESTARTING  Opration .. ");
		nameACustomer();
		reProgram();  // Recursive Function Call 
		break;

	case "3":	
		// Quit
		noCrash = true;
		System.out.println("THANKS! .. ");
		break;  // Recursive Function Call 


	case "4":	
		// CLose
		noCrash = true;
		System.out.println("Closing   Entire Program Bye Bye !!!! .. ");
		welcomeBack();
		displayOutput();
		exitProgram2();
		System.exit(0); // Exit 
		break;

	default : 
		// What the Hell 
		noCrash = true;
		System.out.println("ENTER RIGHT #  .. ");
		// Recursive Function Call 
		Choice();
	}}catch(Exception e) {
		System.out.println("Are YOU SERIOUS??!\n"
					+ "****PLEASE FOLLOW THE INSTRUCTION****\n");
		Choice();
	}}while(!noCrash);

	
	
	
}
}
	
	
	

