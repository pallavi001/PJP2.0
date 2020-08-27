package Report;

import Transaction.Type;
import usage.Date;

public class RepAttribute {
	private long clientId;
	private Type transactionType;
	private Date transactionDate;
	private boolean isPriority;
	private float processingFee;

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public Type getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Type transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public boolean isPriority() {
		return isPriority;
	}

	public void setPriority(boolean isPriority) {
		this.isPriority = isPriority;
	}

	public float getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(float processingFee) {
		this.processingFee = processingFee;
	}

	public RepAttribute(long clientId, Type transactionType, Date transactionDate, boolean isPriority,
			float processingFee) {
		super();
		this.clientId = clientId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.isPriority = isPriority;
		this.processingFee = processingFee;
	}

}
