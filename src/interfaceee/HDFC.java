package interfaceee;

public class HDFC implements ReserveBank,IndianGov{

	public void nEFTFuncdTransferCharges() {
		System.out.println("HDFC charges 2% for NEFT");
	}

	
	public void rTGSFundTranferCharges() {
		System.out.println("HDFC charges 1.25% for RTGS");
		
	}
	
	public static void uPICharges()
	{
		System.out.println("HDFC charges 0% for UPI");
	}
	
	@Override
	public void currancyExchangeRate() {
		System.out.println("currancy rate of HDFC = 0.2%");
		
	}


	@Override
	public void janDhanYoganaAccount() {

System.out.println("Jan dhan account charges are 0");
		
	}


	@Override
	public void m() {

System.out.println("Multiple inheritance example");
		
	}
}
