package org.achfrag.crypto.bitfinex.entity;

public class ExchangeOrder {

	private int orderId;
	private int groupId;
	private long cid;
	private String symbol;
	private long created;
	private long updated;
	private double amount;
	private double amountAtCreation;
	private BitfinexOrderType orderType;
	private String state;
	private double price;
	private double priceAvg;
	private double priceTrailing;
	private double priceAuxLimit;
	private boolean notify;
	private boolean hidden;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(final int orderId) {
		this.orderId = orderId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(final int groupId) {
		this.groupId = groupId;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(final long cid) {
		this.cid = cid;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(final String symbol) {
		this.symbol = symbol;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(final long created) {
		this.created = created;
	}

	public long getUpdated() {
		return updated;
	}

	public void setUpdated(final long updated) {
		this.updated = updated;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(final double amount) {
		this.amount = amount;
	}

	public double getAmountAtCreation() {
		return amountAtCreation;
	}

	public void setAmountAtCreation(final double amountAtCreation) {
		this.amountAtCreation = amountAtCreation;
	}

	public BitfinexOrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(final BitfinexOrderType orderType) {
		this.orderType = orderType;
	}

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public double getPriceAvg() {
		return priceAvg;
	}

	public void setPriceAvg(final double priceAvg) {
		this.priceAvg = priceAvg;
	}

	public double getPriceTrailing() {
		return priceTrailing;
	}

	public void setPriceTrailing(final double priceTrailing) {
		this.priceTrailing = priceTrailing;
	}

	public double getPriceAuxLimit() {
		return priceAuxLimit;
	}

	public void setPriceAuxLimit(final double priceAuxLimit) {
		this.priceAuxLimit = priceAuxLimit;
	}

	public boolean isNotify() {
		return notify;
	}

	public void setNotify(final boolean notify) {
		this.notify = notify;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(final boolean hidden) {
		this.hidden = hidden;
	}

	@Override
	public String toString() {
		return "ActiveOrder [orderId=" + orderId + ", groupId=" + groupId + ", cid=" + cid + ", symbol=" + symbol
				+ ", created=" + created + ", updated=" + updated + ", amount=" + amount + ", amountAtCreation="
				+ amountAtCreation + ", orderType=" + orderType + ", state=" + state + ", price=" + price
				+ ", priceAvg=" + priceAvg + ", priceTrailing=" + priceTrailing + ", priceAuxLimit=" + priceAuxLimit
				+ ", notify=" + notify + ", hidden=" + hidden + "]";
	}

}