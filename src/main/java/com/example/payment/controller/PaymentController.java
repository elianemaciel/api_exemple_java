package com.example.payment.controller;

import com.example.payment.dto.PaymentDTO;
import com.example.payment.model.Payment;
import com.example.payment.repository.PaymentRepository;
import com.example.payment.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class PaymentController {

	private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public PaymentDTO createPayment(@RequestBody PaymentDTO paymentDTO) {
        Payment payment = paymentService.savePayment(paymentDTO);
        return new PaymentDTO(payment);
    }

}
