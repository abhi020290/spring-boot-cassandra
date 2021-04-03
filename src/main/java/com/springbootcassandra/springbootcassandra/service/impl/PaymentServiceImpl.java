package com.springbootcassandra.springbootcassandra.service.impl;

import com.springbootcassandra.springbootcassandra.entity.PaymentDetails;
import com.springbootcassandra.springbootcassandra.repo.PaymentRepository;
import com.springbootcassandra.springbootcassandra.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    public PaymentRepository paymentRepository;

    @Override
    public void save(PaymentDetails paymentDetails) {
        paymentRepository.save(paymentDetails);
    }

    @Override
    public PaymentDetails getPaymentById(String id) {
        Optional<PaymentDetails> byId = paymentRepository.findById(id);
        return byId.orElse(null);
    }
}
