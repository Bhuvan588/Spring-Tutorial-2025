package com.example.store;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment done by Stripe");
        System.out.println("Amount " + amount + " paid");
    }
}
