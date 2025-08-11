package model;

import java.util.List;

public class Order {
	
	
	  private String orderId;
	    private List<String> itemIds;
	    // getters and setters
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public List<String> getItemIds() {
			return itemIds;
		}
		public void setItemIds(List<String> itemIds) {
			this.itemIds = itemIds;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", itemIds=" + itemIds + "]";
		}


}
