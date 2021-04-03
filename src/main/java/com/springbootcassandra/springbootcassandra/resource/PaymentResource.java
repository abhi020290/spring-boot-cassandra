package com.springbootcassandra.springbootcassandra.resource;

import com.springbootcassandra.springbootcassandra.entity.PaymentDetails;
import com.springbootcassandra.springbootcassandra.service.PaymentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentResource {

    @Autowired
    public PaymentService paymentService;

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save(@RequestBody PaymentDetails paymentDetails) {
        paymentService.save(paymentDetails);
        return ResponseEntity.ok("Added Successfully");
    }

    @GetMapping(value = "/{paymentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentDetails> fetchPaymentById(@PathVariable("paymentId") String id) {
        PaymentDetails paymentById = null;
        if (StringUtils.isNotBlank(id) || StringUtils.isNotEmpty(id)) {
            paymentById = paymentService.getPaymentById(id);
        }

        return ResponseEntity.ok(paymentById);

    }
}
