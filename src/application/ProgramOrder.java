package application;

import java.util.Date;

import entities.Order;
import entities.unums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		
		System.out.println(order);
		System.out.println(os1);
		System.out.println(os2);
	}

}
