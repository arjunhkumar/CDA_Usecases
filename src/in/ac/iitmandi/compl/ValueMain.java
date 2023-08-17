/**
 * 
 */
package in.ac.iitmandi.compl;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.CustomerDS;
import in.ac.iitmandi.compl.ds.Dataset;
import in.ac.iitmandi.compl.ds.JSONResult;
import in.ac.iitmandi.compl.ds.value.ValueTransaction;
import in.ac.iitmandi.compl.utils.CommonUtils;

/**
 * @author arjun
 *
 */
public class ValueMain{

	/**
	 * @param args
	 */
	protected static List<CustomerDS> customLoadDS;
	
	public static void main(String[] args) {
		long startTime;
		long finishTime;
		if(CommonUtils.validateArgs(args)) {
			CommonUtils.createOutFile();
			startTime = System.currentTimeMillis();
			Dataset ds = CommonUtils.loadDataSet();
			initializeCustomDS();
			ValueMain mainObj = new ValueMain();
			long analysisTime = mainObj.executeAnalysis(ds);
			finishTime = System.currentTimeMillis();
			System.out.println(CommonUtils.generateLogMsg(String.format("Total execution took %d ms", finishTime - startTime)));
			CommonUtils.writeToOutFile(analysisTime, finishTime - startTime);
		}
	}
	
	private static void initializeCustomDS() {
		customLoadDS = new ArrayList<>();
		for(int i = 0 ; i< 1000; i ++) {
			customLoadDS.add(new CustomerDS());
		}
	}

	public long executeAnalysis(Dataset ds) {
		long startTime;
		long finishTime;
		List<ValueTransaction> valueList = convertToTransaction(ds); //valueList.size()
		startTime = System.currentTimeMillis();
		double sum =0;
		for(ValueTransaction transaction :  valueList) {
			performLoadIntensiveOperation(transaction);
		}
		System.out.println("Final value: "+sum);
		finishTime = System.currentTimeMillis();
		System.out.println(CommonUtils.generateLogMsg(String.format("Analysis execution took %d ms", finishTime - startTime)));
		return finishTime - startTime;
	}
	
	private void performLoadIntensiveOperation(ValueTransaction transaction) {
		double sum = transaction.getPaymentInfo().getTransactionAmount();
		CustomerDS custDSPrev = null;
		int i =0;
		for(CustomerDS custDs : customLoadDS) {
			if(null != custDSPrev) {
				sum+=custDSPrev.exclaim();
			}
			sum+=custDs.exclaim();
			if(i++ % 100 == 0) {
				custDSPrev = custDs;
			}
		}
		System.out.println("Required val: "+sum+transaction.getPaymentInfo().getCustAccountBalance());
		
	}

	public List<ValueTransaction> convertToTransaction(Dataset ds) {
		long startTime;
		long finishTime;
		startTime = System.currentTimeMillis();
		List<ValueTransaction> transactionList = null;
		ValueTransaction transaction = new ValueTransaction();
		if(null != ds && null != ds.getResults() && ds.getResults().length > 0) {
			transactionList = new ArrayList<>();
			for(JSONResult transactionData : ds.getResults()) {
				ValueTransaction valueTransaction = transaction.convertToTransactionObject(transactionData);
				transactionList.add(valueTransaction);
			}
		}
		finishTime = System.currentTimeMillis();
		CommonUtils.printLog(
				String.format("Dataset conversion took "
						+ "%d ms", finishTime - startTime));
		return transactionList;
	}

}
