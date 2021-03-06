/*
Scenario : Order for delivery

Description : A consumer is going to order a delivery through phone calls.

Author:Yang Li
NEUID:001253037

Objects (with Behaviors and State): 
	Object : Customer
		State : name, address, phoneNumber
		Behavior : makePhoneCall(), addItem(), placeDeliveryOrder(), payTheOrder()
	
	
	Object : Shop
		State : Collection of Items, serviceNumber
		Behavior : receiveTheCall(), deliverOrderToCustomer(), acceptPaymentFromCustomer()
	
	Object : Item
		State : name, price, quantity
		Behavior : getName(), getPrice(), getQuantity()
	
	Object : Money
		state : amount	
*/
class Customer{
	String name;
	String address;
	String phoneNumber;
	void makePhoneCall(Shop sh){}
	Item addItem(Item items[]){}
	void placeDeliveryOrder(Item item){}
	Money payTheOrder(Shop sh){}
	
}

class Shop{
        String serviceNumber;
	Item[] items; 
	void receiveTheCall(Customer c){}
	void deliverOrderToCustomer(Customer c, Item i){}
	Money acceptPaymentFromCustomer(Customer c, Money m){}
			
}

class Item{
	String name;
	Float price;
	Integer quantity;
	Float getPrice(){}
	Integer getQuantity(){}
	String getName(){}

}

class Money{
	Float amount;
}

class DeliveryOrder{
	public static void main(String args[]){
		Shop ikea = new Shop();
		ikea.phoneNumber = "18887883"
                
                Item chair = new Item();
                chair.name = "president";
                chair.price = 39.99;
                chair.quantity = 2;
                Item bed = new Item();
                bed.name = "comfortable";
                bed.price = 105.55;
                bed.quantity = 1;
                Item[] items = {chair, bed};
		

		Customer lisa = new Customer();
		lisa.name = "lisa";
		lisa.address = "600 Galer Street Unit 210";
		lisa.phoneNumber = "2054425594"
		
		lisa.makePhoneCall(ikea);
		ikea.recevieTheCall(lisa);
		
		Item item = lisa.addItem(items);
		lisa.placeDeliveryOrder(item);
		Money money = lisa.payTheOrder(ikea);
		ikea.acceptPaymentFromCustomer(lisa,money);
		ikea.deliverOrderToCustomer(lisa,item);
		
		
	}

}
