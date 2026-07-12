package com.cognizant.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.loan.Loan;

@RestController
public class LoanController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoanController.class);
    @GetMapping("/loans/{number}")
    public Loan getLoan(@PathVariable String number) {
        LOGGER.info("Start getLoan()");
        Loan loan = new Loan("H00987987972342", "car", 400000, 3258, 18);
        LOGGER.debug("Loan: {}", loan);
        LOGGER.info("End getLoan()");
        return loan;
    }
}
