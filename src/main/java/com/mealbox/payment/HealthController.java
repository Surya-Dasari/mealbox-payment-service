package com.mealbox.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/payment/health")
    public String health() {
        return "Payment Service is UP";
    }
}
