package application;

import entities.enums.OrderStatus;
import entities.Order;
import java.util.Date;

public class ProgramOrder {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}