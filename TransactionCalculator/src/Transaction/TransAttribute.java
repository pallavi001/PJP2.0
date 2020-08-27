package Transaction;

import usage.Date;

public class TransAttribute {

	private String attributeName;
	private String externalTransactionId;
	private long clientId;
	private String securityId;
	private Date transactionDate;
	private Type type;
	private float marketValue;
	private boolean isPriority;

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getExternalTransactionId() {
		return externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = Long.parseLong(clientId);
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(String marketValue) {
		this.marketValue = Float.parseFloat(marketValue);
	}

	public boolean isPriority() {
		return isPriority;
	}

	public void setPriority(String isPriority) {
		if(isPriority.equals("TRUE"))
			this.isPriority = true;
		else
			this.isPriority = false;
	}

	public TransAttribute(String attributeName, String externalTransactionId, long clientId, String securityId,
			Date transactionDate, Type type, float marketValue, boolean isPriority) {
		super();
		this.attributeName = attributeName;
		this.externalTransactionId = externalTransactionId;
		this.clientId = clientId;
		this.securityId = securityId;
		this.transactionDate = transactionDate;
		this.type = type;
		this.marketValue = marketValue;
		this.isPriority = isPriority;
	}

	public TransAttribute(String attributeName, String externalTransactionId, String clientId, String securityId,
			String transactionDate, String type, String marketValue, String isPriority) {
		super();
		this.attributeName = attributeName;
		this.externalTransactionId = externalTransactionId;
		this.setClientId(clientId);
		this.securityId = securityId;
		this.transactionDate = new Date(transactionDate);
		this.type = Type.valueOf(type);
		this.setMarketValue(marketValue);
		this.setPriority(isPriority);
	}

}