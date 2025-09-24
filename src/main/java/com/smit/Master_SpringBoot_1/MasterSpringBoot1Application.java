package com.smit.Master_SpringBoot_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasterSpringBoot1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringBoot1Application.class, args);
	}
    // 1. Field Injection - Easy of Access (Cannot be made FINAL)
    @Autowired
    private PaymentService paymentservice;

    // 2. Construction Dependency Injection - Recommended (Explicitly described the dependency of the class)
    public MasterSpringBoot1Application(PaymentService paymentservice) {
        this.paymentservice = paymentservice;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentservice.pay();
        System.out.println("Payment done with: "+payment);

    }
}
