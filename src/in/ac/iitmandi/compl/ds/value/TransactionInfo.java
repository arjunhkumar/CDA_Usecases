package in.ac.iitmandi.compl.ds.value;

public  class TransactionInfo {

	
	private final double custAccountBalance;
	private final double transactionAmount;
	private double dummyField1;
	private double dummyField2;
	private double dummyField3;
	private double dummyField4;
	private double dummyField5;
	private double dummyField6;
	private double dummyField7;
	private double dummyField8;
	private double dummyField9;
	
	public TransactionInfo() {
		this.custAccountBalance = 0d;
		this.transactionAmount = 0d;
		this.dummyField1 = 0d;
		this.dummyField2 = 0d;
		this.dummyField3 = 0d;
		this.dummyField4 = 0d;
		this.dummyField5 = 0d;
		this.dummyField6 = 0d;
		this.dummyField7 = 0d;
		this.dummyField8 = 0d;
		this.dummyField9 = 0d;
		
	}

	/**
	 * @param custAccountBalance
	 * @param transactionAmount
	 */
	public TransactionInfo(double custAccountBalance, double transactionAmount) {
		this.custAccountBalance = custAccountBalance;
		this.transactionAmount = transactionAmount;
		this.dummyField1 = custAccountBalance + 8d ;
		this.dummyField2 = custAccountBalance * 8d ;
		this.dummyField3 = custAccountBalance - 8d ;
		this.dummyField4 = custAccountBalance + 8d ;
		this.dummyField5 = custAccountBalance * 8d ;
		this.dummyField6 = custAccountBalance - 8d ;
		this.dummyField7 = custAccountBalance + 8d ;
		this.dummyField8 = custAccountBalance * 8d ;
		this.dummyField9 = custAccountBalance - 8d ;
	}

	/**
	 * @return the custAccountBalance
	 */
	public double getCustAccountBalance() {
		return custAccountBalance;
	}

	/**
	 * @return the transactionAmount
	 */
	public double getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * @return the dummyField1
	 */
	public double getDummyField1() {
		return dummyField1;
	}

	/**
	 * @return the dummyField2
	 */
	public double getDummyField2() {
		return dummyField2;
	}

	/**
	 * @return the dummyField3
	 */
	public double getDummyField3() {
		return dummyField3;
	}

	public double getDummyField4() {
		return dummyField4;
	}

	public double getDummyField5() {
		return dummyField5;
	}

	public double getDummyField6() {
		return dummyField6;
	}

	public double getDummyField7() {
		return dummyField7;
	}

	public double getDummyField8() {
		return dummyField8;
	}

	public double getDummyField9() {
		return dummyField9;
	}

	public int sum() {
		Double d = new Double(this.custAccountBalance+this.transactionAmount
				+ this.dummyField1 +this.dummyField2 + this.dummyField3 +this.dummyField4
				+ this.dummyField5 + this.dummyField6 + this.dummyField7 + this.dummyField8
				+ this.dummyField9);
		return d.intValue();
	}
}
