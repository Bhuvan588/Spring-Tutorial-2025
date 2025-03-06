package com.example.store;

import org.springframework.stereotype.Service;


@Service
public class PayPalPaymentService implements PaymentService{


    @Override
    public void processPayment(double amount) {
        System.out.println("Payment done by Paypal");
        System.out.println("Amount " + amount + " paid");
    }
}
