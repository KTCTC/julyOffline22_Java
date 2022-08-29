package interfaceee;

public interface ReserveBank extends WorldBank{
	
	static final int abc=90;
	public abstract void nEFTFuncdTransferCharges();
	public abstract void rTGSFundTranferCharges();
	void m();
	
	public static void savingAccountMaintananceCharges()
	{
		System.out.println("Charges = 2%");
	}
	
	public default void currentAccountMaintananceCharges()
	{
		System.out.println("Charges = 3%");
	}
	}
