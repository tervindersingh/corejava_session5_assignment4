class Bank
{
	protected long AccountNo;
	protected String AccountholderName;
	protected String AccountholderAddress;
	protected double Balance;
	protected float RateOfInterest;
	public Bank(long an, String aName,String aaddress, double bal)
	{
		AccountNo=an;
		AccountholderName=aName;
		AccountholderAddress=aaddress;
		Balance=bal;
	}
	float getRateOfInterest()
	{
		return RateOfInterest;
	}
	public void Display()
	{
		System.out.println("Account Number :"+AccountNo);
		System.out.println("Account Holder Name:"+AccountholderName);
		System.out.println("Account Holder Address:"+AccountholderAddress);
		System.out.println("Your Balance is:"+Balance);
	}	
}
class SBIBank extends Bank
{
	public SBIBank(long an, String aName,String aaddress, double bal)		
	{
		super(an,aName, aaddress,bal);
		RateOfInterest=8.0f;
	}
	public float getRateOfInterest()
	{
		
		return RateOfInterest;
	}
}	
class ICICIBank extends Bank
{
	public ICICIBank(long an, String aName,String aaddress, double bal)		
	{
		super(an,aName, aaddress,bal);
		RateOfInterest=7.0f;
	}
	public float getRateOfInterest()
	{
		
		return RateOfInterest;
	}
	
}
class AxisBank extends Bank
{
	public AxisBank(long an, String aName,String aaddress, double bal)		
	{
		super(an,aName, aaddress,bal);
		RateOfInterest=9.0f;
	}
	public float getRateOfInterest()
	{
		
		return RateOfInterest;
	}
	
}
public class CalBankInt
{
	public static void main(String args[])
	{
		SBIBank SB1=new SBIBank(5844,"Anil","Delhi",5500.00f);
		SB1.Display();
		float RateOfInt;
		RateOfInt=SB1.getRateOfInterest();
		System.out.println("Rate of Interest at SBI is "+RateOfInt+"%");
		ICICIBank IB1=new ICICIBank(4544,"Ram","Mumbai",6000.00f);
		IB1.Display();
		RateOfInt=IB1.getRateOfInterest();
		System.out.println("Rate of Interest at ICICI Bank is "+RateOfInt+"%");
		AxisBank AB1=new AxisBank(5224,"Kishore", "Bangalore",10000.0f);		
		AB1.Display();
		RateOfInt=AB1.getRateOfInterest();
		System.out.println("Rate of Interest at Axis Bank is "+RateOfInt+"%");
	}
}