/**
 * ENSF 409 Summer 2021 
 * Assignment 1 Exercise 3
 * Student Name: Tsenguun Ulambayar
 */
import java.util.Scanner;

public class SinValidator {

    private int[] SIN;

    private int sumDigit(int x){
	    int result =0;
	
	    while(x > 0){
		    result += x % 10;
		    x = x /10;
	    }
	
	    return result;
    }

	public SinValidator(String sin) {

		SIN = new int[9];
		int i =0;
		int counter =0;
		while(i < sin.length()){

		    if(Character.isDigit(sin.charAt(i))){
			    if(counter < 9)
				    SIN[counter] =(int) sin.charAt(i) - 48;
			    counter++;
			    }
			else{
				System.err.println("Error: Invalid input by the user");
				return;
			}
			i++;
		}
		
		if(counter != 9){
			System.err.println("Error: SIN must be 9 digits...");
			return;
		}	
	}
	/*public int multiplyAndAddDigits (int number){
        int product = number*2;
        int sum = 0;
        while (product>0){
            sum += product % 10;
            product /= 10;
        }
        return sum;
    }
	public boolean validateSin()
	{
		//THIS METHOD DOESN'T WORK. STUDENTS ARE EXPECTED TO COMPLTETE THIS METHOD
        int step1 = SIN[0]+SIN[2]+SIN[4]+SIN[6];
        int step2 = multiplyAndAddDigits(SIN[1]);
        int step3a = multiplyAndAddDigits(SIN[3]);
        int step3b = multiplyAndAddDigits(SIN[5]);
        int step3c = multiplyAndAddDigits(SIN[7]);
        int step4 = step2+step3a+step3b+step3c;
        int step5 = step1+step4;
        int step6 = 10-(step5 %10);

        if(step6 == SIN[8]){
            return true;
        }
        else{
            return false;
        }
	}*/
    //completed definition of method validateSin()
    public boolean validateSin(){
        int step1 = SIN[0]+SIN[2]+SIN[4]+SIN[6];
        //step2 : multiply 2nd digit by 2 and add the digits of the product
        int tempProduct = SIN[1]*2;
        int sum1 = 0;
        while (tempProduct>0){
            sum1 += tempProduct % 10;
            tempProduct /= 10;
        }
        //step 3a : 4th digit
        tempProduct = SIN[3]*2;
        int sum2 = 0;
        while (tempProduct>0){
            sum2 += tempProduct % 10;
            tempProduct /= 10;
        }
        //step 3b : 6th digit
        tempProduct = SIN[5]*2;
        int sum3 = 0;
        while (tempProduct>0){
            sum3 += tempProduct % 10;
            tempProduct /= 10;
        }
        //step 3c : 8th digit
        tempProduct = SIN[7]*2;
        int sum4 = 0;
        while (tempProduct>0){
            sum4 += tempProduct % 10;
            tempProduct /= 10;
        }
    
        int step4 = sum1+sum2+sum3+sum4;
        
        int step5 = step1 + step4;
        int step6 = 10 - (step5 %10);
        if(step6 == SIN[8]){
            return true;
        }
        else{
            return false;
        }
    }

	public static void main(String[] args) {
		// Read user input
	
	    String sin;
		Scanner scan = new Scanner(System.in);	
		while (true)
		{
			System.out.println("Please enter your 10 digit social insurance number"
					+ " or enter quit to terminate the program: ");
			sin = scan.nextLine();
			if(sin.toUpperCase().equals("QUIT"))
				break;
			SinValidator sv = new SinValidator(sin);
			if(sv.validateSin())
				System.out.println("Yes this is a valid SIN\n");
			else
				System.out.println("No this is NOT a valid SIN\n");
			
		}
	}

}
