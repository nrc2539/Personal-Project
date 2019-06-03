import java.util.*;
import java.io.*;
import java.text.*;
public class SelectChoice{
	Scanner in = new Scanner(System.in);
	Vector<String> historyPressure = new Vector<String>();
	Vector<String> historyGravity = new Vector<String>();
	Vector<String> historyResistance = new Vector<String>();
	Vector<String> historyHeat = new Vector<String>();
	PhysicFormula callFormula = new PhysicFormula();
	private String[] listHistory = new String[4];

	/*Method main choice Constant*/
	public boolean choiceConstant(){
		boolean repeatSubchoice=true,back1=false;
		int choice1;
		try{
			System.out.println("\n----Show Constant----");
			System.out.println("1. Gravity on Earth Constant");
			System.out.println("2. Gravitational Constant");
			System.out.println("3. Back to main menu");
			System.out.println("4. Exit Program");
			System.out.print("Enter your choice: ");
			choice1 = in.nextInt();
			if(choice1 == 1 || choice1 == 2|| choice1 ==3||choice1==4){
				back1 = subChoiceConstant(choice1);
			}else{
				System.out.println("\n*** Please select choice from list ***");
			}
		}
		catch(InputMismatchException e){
			System.out.println("\n*** Invalid input !! Please enter choice in number ***");
			in.next();
		}finally{
			return back1;
		}		
	}
	/*Method main choice Pressure*/
	public boolean choicePressure(){
		boolean back2=false;
		int choice2;
		try{
			System.out.println("\n----Pressure Calculation----");
			System.out.println("1. Pressure on area");
			System.out.println("2. Pressure in fluid");
			System.out.println("3. Back to main menu");
			System.out.println("4. Exit Program");
			System.out.print("Enter your choice: ");
			choice2 = in.nextInt();
			if(choice2 == 1 || choice2 == 2||choice2 ==3||choice2==4){
				back2 = subChoicePressure(choice2);
			}else{
				System.out.println("\n*** Please select choice from list ***");
			}			
		}
		catch(InputMismatchException e){
			System.out.println("\n*** Invalid input !! Please enter choice in number ***");
			in.next();
		}finally{
			return back2;
		}		
	}
	/*Method main choice Gravity*/
	public boolean choiceGravity(){
		boolean back3=false;
		int choice3;
		try{
			System.out.println("\n----Gravity Calculation----");
			System.out.println("1. Gravitational force");
			System.out.println("2. Gravity on surface");
			System.out.println("3. Back to main menu");
			System.out.println("4. Exit Program");
			System.out.print("Enter your choice: ");
			choice3 = in.nextInt();
			if(choice3 == 1 || choice3 == 2||choice3==3||choice3==4){
				back3 = subChoiceGravity(choice3);
			}else{
				System.out.println("\n*** Please select choice from list ***");
			}		
		}
		catch(InputMismatchException e){
			System.out.println("\n*** Invalid input !! Please enter choice in number ***");
			in.next();
		}finally{
			return back3;
		}		
	}
	/*Method main choice Resistance*/
	public boolean choiceResistance(){
		boolean back4=false;
		int choice4;
		try{
			System.out.println("\n----Electric Resistance Calculation----");
			System.out.println("1. Serial Resistance");
			System.out.println("2. Parallel Resistance");
			System.out.println("3. Back to main menu");
			System.out.println("4. Exit Program");
			System.out.print("Enter your choice: ");
			choice4 = in.nextInt();
			if(choice4 == 1 || choice4 == 2||choice4 ==3||choice4==4){
				back4 = subChoiceResistance(choice4);
			}else{
				System.out.println("\n*** Please select choice from list ***");
			}
		}
		catch(InputMismatchException e){
			System.out.println("\n*** Invalid input !! Please enter choice in number ***");
			in.next();
		}finally{
			return back4;
		}		
	}
	/*Method main choice Heat energy*/
	public boolean choiceHeat(){
		boolean back5=false;
		int choice5;
		try{
			System.out.println("\n----Heat Energy Calculation----");
			System.out.println("1. Heat energy for changing temperature");
			System.out.println("2. Latent heat");
			System.out.println("3. Back to main menu");
			System.out.println("4. Exit Program");
			System.out.print("Enter your choice: ");
			choice5 = in.nextInt();
			if(choice5 == 1 || choice5 == 2|| choice5 == 3||choice5==4){
				back5 = subChoiceHeat(choice5);
			}else{
				System.out.println("\n*** Please select choice from list ***");
			}	
		}
		catch(InputMismatchException e){
			System.out.println("\n*** Invalid input !! Please enter choice in number ***");
			in.next();
		}finally{
			return back5;
		}		
	}

	/*Method main choice show history*/
	public void choiceShowHistory(){
		int[] numOrder = {1,2,3,4};
		int orderIndex = 0;
		int ansChoiceHistory;
		boolean checkInputChoiceHistory = true;
		if(!historyPressure.isEmpty() || !historyGravity.isEmpty() || !historyResistance.isEmpty()|| !historyHeat.isEmpty()){
			do{
				try{
					System.out.println("--------------Show History--------------");
					if(!historyPressure.isEmpty()){
						System.out.println(numOrder[orderIndex]+". Pressure calculation History");
						//listHistory.addAll(orderIndex , historyPressure);
						listHistory[orderIndex] = "\n-----Pressure Calculation history-----";
						
						for(int a=0; a<historyPressure.size();a++){
							listHistory[orderIndex] = listHistory[orderIndex].concat(historyPressure.elementAt(a));
						}
						orderIndex++;
					}
					if(!historyGravity.isEmpty()){
						System.out.println(numOrder[orderIndex]+". Gravity calculation History");
						//listHistory.addAll(orderIndex , historyGravity);
						listHistory[orderIndex] = "\n-----Gravity Calculation history-----";
						
						for(int a=0; a<historyGravity.size();a++){
							listHistory[orderIndex] = listHistory[orderIndex].concat(historyGravity.elementAt(a));
						}
						orderIndex++;
					}
					if(!historyResistance.isEmpty()){
						System.out.println(numOrder[orderIndex]+". Resistance calculation History");
						//listHistory.addAll(orderIndex , historyResistance);
						listHistory[orderIndex] ="\n-----Resistance Calculation history-----";
						
						for(int a=0; a<historyResistance.size();a++){
							listHistory[orderIndex] = listHistory[orderIndex].concat(historyResistance.elementAt(a));
						}
						orderIndex++;
					}
					if(!historyHeat.isEmpty()){
						System.out.println(numOrder[orderIndex]+". Heat Energy calculation History");
						//listHistory.addAll(orderIndex , historyHeat);
						listHistory[orderIndex] ="\n-----Heat Energy Calculation history-----";
						
						for(int a=0; a<historyHeat.size();a++){
							listHistory[orderIndex] = listHistory[orderIndex].concat(historyHeat.elementAt(a));
						}
						orderIndex++;
					}
					System.out.print("Enter your choice : ");
					ansChoiceHistory = in.nextInt();
					if(ansChoiceHistory>0 && ansChoiceHistory<=orderIndex){
						for(int checkChoicelist=0; checkChoicelist<orderIndex; checkChoicelist++){
							if(ansChoiceHistory == checkChoicelist+1){
								System.out.println(listHistory[checkChoicelist]);						
							}
						}
						checkInputChoiceHistory = false;
					}else{
						System.out.println("\n*** Please select choice from list ***");
						orderIndex = 0;
						continue;
					}
				}catch(InputMismatchException e){
					System.out.println("\n*** Invalid input !! Please enter choice in number ***");
					in.next();
					orderIndex = 0;
					continue;
				}
			}while(checkInputChoiceHistory);
		}else{
			System.out.println("\n*** No Calculation Historty ***");
		}
	}

	/*Method main choice for exit*/
	public void choiceExit() throws IOException {
		Date date = new Date();
		SimpleDateFormat time = new SimpleDateFormat ("E dd.MM.yyyy 'at' HH:mm:ss");
		FileWriter fileWriter = new FileWriter("historyfile.txt",true);
   		PrintWriter printWriter = new PrintWriter(fileWriter);
	   	if(!historyPressure.isEmpty() || !historyGravity.isEmpty() || !historyResistance.isEmpty()|| !historyHeat.isEmpty()){
	   		printWriter.println("> Calculation History on "+ time.format(date));
	    	if(!historyPressure.isEmpty()){
	    		printWriter.println(">>Pressure Calculation history<<");
	    		for(int n=0; n<historyPressure.size(); n++){
	    			printWriter.println(historyPressure.elementAt(n));
	    		}
	    		printWriter.println("");
	    	}
	    	if(!historyGravity.isEmpty()){
	    		printWriter.println(">>Gravity Calculation history<<");
	    		for(int n=0; n<historyGravity.size(); n++){
	    			printWriter.println(historyGravity.elementAt(n));
	    		}
	    		printWriter.println("");
	    	}
			if(!historyResistance.isEmpty()){
	    		printWriter.println(">>Electric Resistance Calculation history<<");
				for(int n=0; n<historyResistance.size(); n++){
	    			printWriter.println(historyResistance.elementAt(n));
	    		}
	    		printWriter.println("");
			}
			if(!historyHeat.isEmpty()){
	    		printWriter.println(">>Heat Energy Calculation History<<");
				for(int n=0; n<historyHeat.size(); n++){
	    			printWriter.println(historyHeat.elementAt(n));
	    		}
	    		printWriter.println("");
			}
	       	printWriter.close();
	    }else{
	    	System.exit(0);
	    }
    	System.exit(0);
	}
//-------------------------------------------------------------------------------------------------------------------
	/*Method for subChoice*/

	/*Method subChoice Constance*/
	public boolean subChoiceConstant(int choice) throws IOException {
		boolean subBack1 = false;
		if(choice == 1){
			System.out.println("Constant of gravity on earth is " + callFormula.getGravity());
		}else if (choice == 2){
			System.out.println("Constant of Gravitational is " + callFormula.getGravitational());
		}else if (choice ==3) {
			subBack1 = true;
		}
		else{
			choiceExit();
		}
		return subBack1;
	}

	/*Method subChoice Pressure*/
	public boolean subChoicePressure(int choice) throws IOException {
		boolean subBack2 = false;
		try{	
			if(choice == 1){
				System.out.print("Enter force(in N): ");
				double f = in.nextDouble();
				System.out.print("\nEnter area(in m^2): ");
				double area = in.nextDouble();
				callFormula.calPressureGravity(f,area);
				System.out.println("\nThe pressure is "+callFormula.getPressure1());

				//add history of pressure on area calculation
				historyPressure.addElement("\nEnter force(in N): "+callFormula.getFpressure());
				historyPressure.addElement("\nEnter area (in m^2): "+callFormula.getArea());
				historyPressure.addElement("\nThe pressure is "+callFormula.getPressure1());
				historyPressure.addElement("\n-----------------------------------------");
			}else if (choice == 2) {
				System.out.print("Enter density of fluid(in g/cm^3): ");
				double q = in.nextDouble();
				System.out.print("\nEnter dept of fluid (in cm): ");
				double h = in.nextDouble();
				callFormula.calPressureFluid(q,h);
				System.out.println("\nThe pressure is "+callFormula.getPressure2());

				//add history of pressure in fluid calculation
				historyPressure.addElement("\nEnter density of fluid(in g/cm^3): "+callFormula.get_q());
				historyPressure.addElement("\nEnter dept of fluid (in cm): "+callFormula.get_height());
				historyPressure.addElement("\nThe pressure is "+callFormula.getPressure2());
				historyPressure.addElement("\n-----------------------------------------");
			}else if (choice == 3) {
				subBack2 = true;
			}
			else{
				choiceExit();
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please Enter value in number!!");
			in.next();
		}
		return subBack2;
	}

	/*Method subChoice Gravity*/
	public boolean subChoiceGravity(int choice) throws IOException {
		boolean subBack3 = false;
		try{	
			if(choice == 1){
				System.out.print("Enter mass of the body 1 (in kg) : ");
				double m1 = in.nextDouble();
				System.out.print("\nEnter mass of the body 2 (in kg) : ");
				double m2 = in.nextDouble();
				System.out.print("\nEnter distance between the two bodies(in m): ");
				double r = in.nextDouble();
				callFormula.calGravityForce(m1,m2,r);
				System.out.println("\nThe force due to gravity acting on two bodies is "+callFormula.getGravityForce());

				//add history of calling this method
				historyGravity.addElement("\nEnter mass of the body 1 (in kg) : "+callFormula.get_m1());
				historyGravity.addElement("\nEnter mass of the body 2 (in kg) : "+callFormula.get_m2());
				historyGravity.addElement("\nEnter distance between the two bodies(in m): "+callFormula.get_r());
				historyGravity.addElement("\nThe force due to gravity acting on two bodies is "+callFormula.getGravityForce());
				historyGravity.addElement("\n-----------------------------------------");
			}
			else if (choice == 2){
				System.out.print("Enter M(in kg) : ");
				double M = in.nextDouble();
				System.out.print("\nEnter radius of object mass M (in m): ");
				double radius = in.nextDouble();
				callFormula.calGravitySurface(M,radius);
				System.out.println("\nThe gravity on surface is "+callFormula.getGravitySurface());

				//add history of calling this method
				historyGravity.addElement("\nEnter M(in kg) : "+callFormula.get_M());
				historyGravity.addElement("\nEnter radius of object mass M (in m): "+callFormula.get_r());
				historyGravity.addElement("\nThe gravity on surface is "+callFormula.getGravitySurface());
				historyGravity.addElement("\n-----------------------------------------");
			}else if (choice == 3) {
				subBack3 = true;
			}
			else {
				choiceExit();
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please Enter value in number!!");
			in.next();
		}
		return subBack3;
	}

	/*Method subChoice Resistance*/
	public boolean subChoiceResistance(int choice) throws IOException {
		boolean subBack4 = false;
		try{
			if(choice == 1){
				System.out.print("Enter number of resistor: ");
				int n = in.nextInt();
				double[] resistor1 = new double[n];
				for(int i=0;i<n;i++){
				 	System.out.print("\nEnter resistance value of resistor: ");
				 	resistor1[i] = in.nextDouble();
				}
				callFormula.calSerialResistance(resistor1);
				System.out.println("\nSummation of serial resistance is "+callFormula.getResistance1());
				
				//add history of calling this method
				double[] resistorFromSerialMethod = callFormula.get_Resistor();
				historyResistance.addElement("\n\nEnter number of resistor: "+resistorFromSerialMethod.length);
				for(int k=0;k<resistorFromSerialMethod.length;k++){
					historyResistance.addElement("\nEnter resistance value of resistor: "+resistorFromSerialMethod[k]);
				}
				historyResistance.addElement("\nSummation of serial resistance is "+callFormula.getResistance1());
				historyResistance.addElement("\n-----------------------------------------");
			}
			else if (choice == 2) {
				System.out.print("Enter number of resistor: ");
				int m = in.nextInt();
				double[] resistor2 = new double[m];
				for(int j=0;j<m;j++){
				 	System.out.print("\nEnter resistance value of resistor: ");
				 	resistor2[j] = in.nextDouble();
				}
				callFormula.calParallelResistance(resistor2);
				System.out.println("\nSummation of parallel resistance is "+callFormula.getResistance2());
				
				//add history of calling this method
				double[] resistorFromParallelMethod = callFormula.get_Resistor();
				historyResistance.addElement("\n\nEnter number of resistor: "+resistorFromParallelMethod.length);
				for(int l=0;l<resistorFromParallelMethod.length;l++){
					historyResistance.addElement("\nEnter resistance value of resistor: "+resistorFromParallelMethod[l]);
				}
				historyResistance.addElement("\nSummation of parallel resistance is "+callFormula.getResistance2());
				historyResistance.addElement("\n-----------------------------------------");

			}else if (choice == 3) {
				subBack4 = true;
			}
			else {
				choiceExit();
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please Enter value in number!!");
			in.next();
		}
		return subBack4;
	}

	/*Method subChoice Heat energy*/
	public boolean subChoiceHeat(int choice) throws IOException {
		boolean subBack5 = false;
		try{
			if(choice == 1){
				System.out.print("Enter mass(in g): ");
				double mass1 = in.nextDouble();
				System.out.print("\nEnter specific heat capacity (in J/g/Celsius): ");
				double c = in.nextDouble();
				System.out.print("\nEnter Temperature initial(in Celsius): ");
				double t1 = in.nextDouble();
				System.out.print("\nEnter Temperature final(in Celsius): ");
				double t2 = in.nextDouble();
				callFormula.calQCMT(mass1,c,t1,t2);
				System.out.println("\nHeat energy for changing temperature is "+callFormula.getQ1());

				//add history of calling this method
				historyHeat.addElement("\nEnter mass(in g): "+callFormula.get_m());
				historyHeat.addElement("\nEnter specific heat capacity (in J/g/Celsius): "+callFormula.get_c());
				historyHeat.addElement("\nEnter Temperature initial(in Celsius): "+callFormula.get_t1());
				historyHeat.addElement("\nEnter Temperature final(in Celsius): "+callFormula.get_t2());
				historyHeat.addElement("\nHeat energy for changing temperature is "+callFormula.getQ1());
				historyHeat.addElement("\n-----------------------------------------");

			}else if (choice == 2) {
				System.out.print("Enter mass(in g): ");
				double mass2 = in.nextDouble();
				System.out.print("\nEnter specific latent heat of material: ");
				double l = in.nextDouble();
				callFormula.calQML(mass2,l);
				System.out.println("\nLatent Heat is "+callFormula.getQ2());

				//add history of calling this method;
				historyHeat.addElement("\nEnter mass(in g): "+callFormula.get_m());
				historyHeat.addElement("\nEnter specific latent heat of material: "+callFormula.get_l());
				historyHeat.addElement("\nLatent Heat is "+callFormula.getQ2());
				historyHeat.addElement("\n-----------------------------------------");
				
			}else if (choice == 3) {
				subBack5 = true;
			}
			else {
				choiceExit();
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please Enter value in number!!");
			in.next();
		}
		return subBack5;
	}
}
