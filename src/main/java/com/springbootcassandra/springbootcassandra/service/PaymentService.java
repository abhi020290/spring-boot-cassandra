package com.springbootcassandra.springbootcassandra.service;

import com.springbootcassandra.springbootcassandra.entity.PaymentDetails;

public interface PaymentService {

    public void save(PaymentDetails paymentDetails);

    public PaymentDetails getPaymentById(String id);
}
