/*
Scenario : Booking an Airbnb

Description : A tourist wants to book a house on Airbnb app.

Author:Yang Li
NEUID:001253037

Objects (with Behaviors and State): 
	Object : tourist
		State : name, accountID
		Behavior : visitApp(), searchARoom(), orderARoom(), payRoomCharge()
	
	
	Object : tourapp
		State : Collection of Available Rooms
		Behavior : displayRooms(),  acceptPaymentFromTourist(), sendConfirmationToTourist()
	
	Object : room
		State : name, price, address,checkinTime, checkoutTime
		Behavior : getName(), getPrice() 
	
	Object : money
		state : amount	
*/

class Tourist{
	String name;
	Integer accountID;
	void visitApp(tourapp ta){}
	Room searchARoom(Room rooms[]){}
	void orderARoom(Room room){}
	Money payRoomCharge(tourapp ta){}
	
	
}

class Tourapp{
        Room[] rooms;
        Room displayRooms(){}
	void acceptPaymentFromTourist(Tourist t, Money m){}
	void sendConfirmationToTourist(Tourist t){}
			
}

class Room{
	String name;
	Float price;
	String address;
	Date checkinTime;
	Date checkoutTime;
	String getName(){}
	Float getPrice(){}
	

}

class Money{
	Float amount;
}

class BookAirbnb{
	public static void main(String args[]){
	Tourapp airbnb = new Tourapp();
	
	Room harbourview = new Room();
	harbourview.name = "harbourview";
	harbourview.price = 320.0;
	harbourview.address = "Seattle";
	harbourview.checkinTime = "11/08/2016";
	harbourview.checkoutTime = "11/18/2016";
	Room mountainview = new Room();
	mountainview.name = "mountainview";
	mountainview.price = 270.0;
	mountainview.address = "Bellevue";
	mountainview.checkinTime = "11/08/2016";
	mountainview.checkoutTime = "11/18/2016"
	Room[] rooms = {harbourview,mountainview};
	
	Customer allen = new Customer();
	allen.name = "allen";
	allen.accountID = "allengo";
	
	allen.visitApp(airbnb);
	Room[] rooms = airbnb.displayRooms();
	Room room = allen.searchARoom(rooms);
	allen.orderARoom(room);
	Money money = allen.payRoomCharge(airbnb);
	airbnb.acceptPaymentFromTourist(allen,money);
	airbnb.sendConfirmationToTourist(allen);

	}

}
