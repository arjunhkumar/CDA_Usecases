/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class CustomStringDS {
	
	
	private String customerID;
	private String customerDOB;
	private String custGender;
	private String custLocation;
	
	
	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}


	/**
	 * @param customerID
	 * @param customerDOB
	 * @param custGender
	 * @param custLocation
	 */
	public CustomStringDS(String customerID, String customerDOB, String custGender, String custLocation) {
		this.customerID = customerID;
		this.customerDOB = customerDOB;
		this.custGender = custGender;
		this.custLocation = custLocation;
	}


	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	/**
	 * @return the customerDOB
	 */
	public String getCustomerDOB() {
		return customerDOB;
	}


	/**
	 * @param customerDOB the customerDOB to set
	 */
	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}


	/**
	 * @return the custGender
	 */
	public String getCustGender() {
		return custGender;
	}


	/**
	 * @param custGender the custGender to set
	 */
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}


	/**
	 * @return the custLocation
	 */
	public String getCustLocation() {
		return custLocation;
	}


	/**
	 * @param custLocation the custLocation to set
	 */
	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}
	
}
