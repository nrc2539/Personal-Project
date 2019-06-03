import java.util.*;
import java.io.*;
public class CallPhysic{
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int select;
		boolean topicCheck = true,backMainMenu=true;
		String backToMain="";
		
		SelectChoice callSelectChoice = new SelectChoice();

		do{
			do{
				try{
					//main menu
					System.out.println("\n----------Main Menu----------");
					System.out.println("1. Show constant");					
					System.out.println("2. Pressure Calculation");				
					System.out.println("3. Gravity Force Calculation");					
					System.out.println("4. Electric Resistance Calculation");						
					System.out.println("5. Heat Energy Calculation");					
					System.out.println("6. Show History");
					System.out.println("7. Exit Program");
					
					System.out.print("Enter your choice: ");
					select = in.nextInt();
					//show constant choice
					if(select == 1){
						boolean backToCoreMenu1;
						boolean runAgain1;
						boolean backTochoice1;						
						do{
							do{
								backToCoreMenu1 = callSelectChoice.choiceConstant();
								if(backToCoreMenu1){
									break;
								}
								System.out.print("\nDo you want to run again ?(Y/N): ");
								String run1=in.next();
								System.out.println("");
								if(run1.equals("Y")||run1.equals("y")){
									runAgain1=true;
								}else{
									runAgain1 = false;
								}
							}while(runAgain1);
							if(backToCoreMenu1){
								break;
							}
							System.out.print("Back to Main Menu ?(Y/N): ");
							backToMain = in.next();
							if(backToMain.equals("Y")||backToMain.equals("y")){
								backTochoice1 = false;
							}else{
								backTochoice1=true;
							}
						}while(backTochoice1);
					}
					//calculation pressure choice
					else if (select == 2) {
						boolean backToCoreMenu2;
						boolean runAgain2;
						boolean backTochoice2;
						do{
							do{
								backToCoreMenu2 = callSelectChoice.choicePressure();
								if(backToCoreMenu2){
									break;
								}
								System.out.print("\nDo you want to run again ?(Y/N): ");
								String run2 = in.next();
								System.out.println("");
								if(run2.equals("Y")||run2.equals("y")){
									runAgain2=true;
								}else{
									runAgain2 = false;
								}
							}while(runAgain2);
							if(backToCoreMenu2){
								break;
							}
							System.out.print("Back to Main Menu ?(Y/N): ");
							backToMain = in.next();
							if(backToMain.equals("Y")||backToMain.equals("y")){
								backTochoice2 = false;
							}else{
								backTochoice2=true;
							}
						}while(backTochoice2);
					}
					//calculation gravity choice
					else if (select == 3) {
						boolean backToCoreMenu3;
						boolean runAgain3;
						boolean backTochoice3;
						do{
							do{
								backToCoreMenu3 = callSelectChoice.choiceGravity();
								if(backToCoreMenu3){
									break;
								}
								System.out.print("\nDo you want to run again ?(Y/N): ");
								String run3 =in.next();
								System.out.println("");
								if(run3.equals("Y")||run3.equals("y")){
									runAgain3 = true;
								}else{
									runAgain3 = false;
								}
							}while(runAgain3);
							
							if(backToCoreMenu3){
								break;
							}
							System.out.print("Back to Main Menu ?(Y/N): ");
							backToMain = in.next();
							if(backToMain.equals("Y")||backToMain.equals("y")){
								backTochoice3 = false;
							}else{
								backTochoice3 = true;
							}
						}while(backTochoice3);
					}
					//calculation resistance choice
					else if (select == 4) {
						boolean backToCoreMenu4;
						boolean runAgain4;
						boolean backTochoice4;
						do{
							do{
								backToCoreMenu4 = callSelectChoice.choiceResistance();
								if(backToCoreMenu4){
									break;
								}
								System.out.print("\nDo you want to run again ?(Y/N): ");
								String run4 =in.next();
								System.out.println("");
								if(run4.equals("Y")||run4.equals("y")){
									runAgain4 = true;
								}else{
									runAgain4 = false;
								}
							}while(runAgain4);
							if(backToCoreMenu4){
								break;
							}
							System.out.print("Back to Main Menu ?(Y/N): ");
							backToMain = in.next();
							if(backToMain.equals("Y")||backToMain.equals("y")){
								backTochoice4 = false;
							}else{
								backTochoice4=true;
							}
						}while(backTochoice4);
					}
					//calculation heat choice
					else if (select == 5) {
						boolean backToCoreMenu5;
						boolean runAgain5;
						boolean backTochoice5=true;
						do{
							do{
								backToCoreMenu5 = callSelectChoice.choiceHeat();
								if(backToCoreMenu5){
									break;
								}
								System.out.print("\nDo you want to run again ?(Y/N): ");
								String run5 =in.next();
								System.out.println("");
								if(run5.equals("Y")||run5.equals("y")){
									runAgain5 = true;
								}else{
									runAgain5 = false;
								}
							}while(runAgain5);
							if(backToCoreMenu5){
								break;
							}
							System.out.print("Back to Main Menu ?(Y/N): ");
							backToMain = in.next();
							if(backToMain.equals("Y")||backToMain.equals("y")){
								backTochoice5 = false;
							}else{
								backTochoice5 = true;
							}
						}while(backTochoice5);
					}
					else if (select == 6) {
						callSelectChoice.choiceShowHistory();						
					}
					else if (select == 7) {
						callSelectChoice.choiceExit();
					}
					else {
						System.out.println("\n*** Please select choice in menu ***");
						continue;
					}
					topicCheck = false; //flag for do main again
				}
				catch(InputMismatchException e){
					System.out.println("\n*** Invalid input !! Please enter choice in number ***");
					in.next();
				}
			}while(topicCheck);
		}while(backMainMenu);
	}
}