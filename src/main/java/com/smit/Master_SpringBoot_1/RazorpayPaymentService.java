package com.smit.Master_SpringBoot_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider",havingValue = "razorpay") //appilcation.properties has the config
public class RazorpayPaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Attempting payment with: " + payment);
        return payment;
    }
}
