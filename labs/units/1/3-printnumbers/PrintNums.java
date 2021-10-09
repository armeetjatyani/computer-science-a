/**
 * Last name: Jatyani
 * First name: Armeet
 * Period: 2
 * 
 * In this lab you will practice writing while loops using the MathLib class that has
 * been written for you. Follow the directions given in the comments. You will need
 * to use System.out.println (int) to print the numbers to the console.
 * 
 * After you have filled in the instructions, copy and paste the program into Code Check.
 * The link is provided on canvas. Once you get the program to pass, download the
 * zipped file generated by Code Check. DO NOT open or unzip this file. Submit the zipped file 
 * on Canvas. 
 *
 */
public class PrintNums {

	public static void main(String[] args) {
		//1. Create a MathLib object
        MathLib math = new MathLib();
        	
		int num = 1; //an integer variable num is initialized to 1
		//Use the MathLib object to print all even numbers between num and 100. Follow 
		//the steps outlined below:
		//2. Write a while loop to go through all the numbers between num and 100 (noninclusive)
		while(math.isLessThan(num, 100)) {
            //3. Write a conditional to check if num is even. If it is print, print it
            if(math.isEven(num)) {
                System.out.println(num);
            }
            //4. Increment the value of num by 1. Use one of the methods from the MathLib class
            num = math.incrementNum(num);
        }
	}

}
