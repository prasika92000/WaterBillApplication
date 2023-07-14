import java.util.Scanner;
class WaterBill
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Electricity Unit : ");
		int units = input.nextInt();
		float totalWaterBill;
		int meterCharge=75;
		int charge;
		
		if(units<=100)
		{			
			charge = units * 5;
		}
		else if(units<=250)
		{
			charge = units * 10;
		}
		
		else
		{
			charge = units * 20;
		}
 
		
		totalWaterBill = charge + meterCharge;
		System.out.println("Total Water Bill : "+ totalWaterBill);
	}
}