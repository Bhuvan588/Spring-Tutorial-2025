package com.example.store;

import org.springframework.stereotype.Service;


public interface PaymentService {
    void processPayment(double amount);
}
