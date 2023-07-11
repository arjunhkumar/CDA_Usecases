package in.ac.iitmandi.compl.ds;

import java.util.Random;

public class CustomerDS {

	private CustomIntDS custIntDS;
	private CustomStringDS custStringDS;
	/**
	 * @param customerID
	 * @param customerDOB
	 * @param custGender
	 * @param custLocation
	 */
	public CustomerDS() {
		Random random = new Random();
		this.custStringDS = new CustomStringDS(generateRandomString(), generateRandomString(), generateRandomString(), generateRandomString());
		this.custIntDS = new CustomIntDS(random.nextInt(),random.nextInt(),random.nextInt());
	}


	/**
	 * @return the custIntDS
	 */
	public CustomIntDS getCustIntDS() {
		return custIntDS;
	}


	/**
	 * @param custIntDS the custIntDS to set
	 */
	public void setCustIntDS(CustomIntDS custIntDS) {
		this.custIntDS = custIntDS;
	}


	/**
	 * @return the custStringDS
	 */
	public CustomStringDS getCustStringDS() {
		return custStringDS;
	}


	/**
	 * @param custStringDS the custStringDS to set
	 */
	public void setCustStringDS(CustomStringDS custStringDS) {
		this.custStringDS = custStringDS;
	}


	public int exclaim() {
		int blackHole = 0;
		Random random = new Random();
		blackHole += this.getCustIntDS().getCustomerX() + random.nextInt();
		blackHole += this.getCustStringDS().getCustGender().hashCode() + random.nextInt();
		blackHole += this.getCustStringDS().getCustomerID().hashCode() + random.nextInt();
		blackHole += this.getCustIntDS().getCustomerZ() + random.nextInt();
		return blackHole;
	}
	
	
	public String generateRandomString() {
		int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    return random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	}
}
