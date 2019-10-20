package work;


	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;



	public class newWork{
		//Variable declaration
				static String myName;
				static double totalProduct;
				static double grossPayAmount;
				static double discountPay;
				static Scanner boss;
				static String [] nameOfProduct = new String[10];
				 static int numberOfProduct;
				static double priceOftheProduct;
				static double grossPay2;
				static int de;
				static int ig;

		public static void nameACustomer() {
			//in this module a user is able to enter customers name
			System.out.print("Whats your name: ");
			System.out.println("(Enter your name)");
			System.out.print("My name is ");

			boss = new Scanner(System.in);
			myName= boss.nextLine();
		}
	public static void getProduct() {
		//in this module a user is able to enter product's name
	for ( ig=0; ig<nameOfProduct.length;ig++) {
		System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
			System.out.print( "Product: " + (ig+1));
		boss = new Scanner(System.in);
		System.out.println(" (What did you buy today??)");
		System.out.print("Product name: ");
		nameOfProduct[ig]= boss.nextLine();
		System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
		System.out.print("Amount?? ");
	System.out.println(" >>Product Quantity: (Must be a whole number) ");
	System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
	System.out.print("I got ");
	numberOfProduct= boss.nextInt();
	if (numberOfProduct<=0) {
		System.out.println("Invalid input captured!!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		break;}
	System.out.println(" OF ***" + nameOfProduct[ig]);
	System.out.println("~ ~ ` `~ ~ ~ ~ ~``");
	System.out.print("Cost?? ");
	System.out.println(">>Product Price: (Must be a  real number) ");
	System.out.print("$ ");
	priceOftheProduct= boss.nextDouble();
	if (priceOftheProduct<=0) {
		System.out.println("Invalid input captured!!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		break;}
	if ((priceOftheProduct*numberOfProduct)<0) {
		System.out.println("Invalid input captured!!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		System.out.println("CALL MANAGER!!!");
		break;
	}else if ((priceOftheProduct*numberOfProduct)>0) {
		totalProduct = numberOfProduct*priceOftheProduct;
		System.out.print("Your TOTAL~!:$ ?");
		System.out.println();
	}
	if (ig>=0 && ig<=9) {
		System.out.println("DO You Want to continue Shopping??...(type 'YES' or 'no' to exit)");
		boss = new Scanner(System.in);
		String noT = boss.nextLine();
		if(noT.equals("YES")) {
			System.out.println("Scann Your next Product!)");
			continue;
		}
		else if(noT.equals("no")) {
	 exitProgram();
	break;
		}
	}
		
	}
	}


	public static void grossPayAmount() {
		grossPayAmount = totalProduct;
	}
	public static void grossPayAmount2() {
		grossPay2 = (grossPayAmount+totalProduct);
		System.out.println(grossPay2);
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
			discountPay = grossPayAmount-30;
			System.out.println("-$30 DISCOUNT ");
		}else if (grossPayAmount<0) {
			System.out.println("Invalid input captured!!!!");
		}
		} 
		public static void welcomeBack() {
			//In this module the customer is greeted.
			for( de=1; de<10;de++) {
			
				System.out.println();
				System.out.println();
				System.out.println();	
			System.out.println("                    "+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("                    "+"customer " +de);
			System.out.println("                    "+"            Welcome "+ myName+ "         ");
			System.out.println();
			System.out.println("                    "+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                    "+"> > > > > >" + "BIG TIKI EMPIRE" + "< < < < < ");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("                 "+"               " + "25, Left St"+ "            ");
			System.out.println("                 "+" 	" + "HelloJava, Bangladesh 2019" + "        ");
			System.out.println("                 "+"             " + "  (508)-$$$-$$$$  " + "        ");
			System.out.println("");
			System.out.println("                    "+"_____________" + "$ALES RECEIPT"+ "______________");
			System.out.println("");
			DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss a");
			Date date = new Date();
			System.out.println("                    Our Checker Today Is");
			System.out.println("                     "+dateFormat.format(date)+"        * Java");
			if (de<=de) {
				break;
			}else if(de>=de++) {
				continue;
			}
			
			}
			
			
			}
	public static void displayOutput() {
		System.out.println("                    "+"=======================================");
	System.out.println("                    "+"GUEST: " + myName);
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("                    "+"Products "+"              "+ " Price of Products");
	System.out.println();
	System.out.println("                    "+nameOfProduct[ig] + "       "+numberOfProduct+"q X $"+priceOftheProduct );
	System.out.println("                    "+"                                 $" + totalProduct );
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("                    "+"Product Total Price:" );
	System.out.println("                    "+"$" + totalProduct );
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
	System.out.println("Gross Pay Amount: " + grossPay2);
	System.out.println("Discount: $" + ((grossPay2)-discountPay));
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
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
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
			
			
			nameACustomer();
			getProduct();
			grossPayAmount();
			discountPay();
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
				welcomeBack();
				displayOutput();
		 exitProgram2();
					continue;
			}else 
				if(i>=i++){
				break;
			}
						
				
		
		}

		
		
		
	}

	}

