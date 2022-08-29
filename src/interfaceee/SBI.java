package interfaceee;

public class SBI implements ReserveBank {
int ab = 89;
	@Override
	public void nEFTFuncdTransferCharges() {
		System.out.println("SBI charges 1.5% for NEFT");
	}

	
	public void rTGSFundTranferCharges() {
		System.out.println("SBI charges 1.2% for RTGS");
		
	}
	public void imPSFundTransfer()
	{
		System.out.println("SBI charges 2% for IMPS");
	}
	@Override
	public void currancyExchangeRate() {
		System.out.println("currancy rate of SBI = 0.2%");
		
	}
public static void main(String[] args) {
	
	ReserveBank.savingAccountMaintananceCharges();
	
	ReserveBank rsbi = new SBI();
	rsbi.rTGSFundTranferCharges();
	rsbi.nEFTFuncdTransferCharges();
	rsbi.currentAccountMaintananceCharges();
	
	SBI sbi = new SBI();
	System.out.println(sbi.abc);
  sbi.imPSFundTransfer();
  sbi.rTGSFundTranferCharges();
  sbi.nEFTFuncdTransferCharges();
  sbi.currentAccountMaintananceCharges();
}


@Override
public void m() {
	// TODO Auto-generated method stub
	
}




}
