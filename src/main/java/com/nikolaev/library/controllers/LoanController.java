package com.nikolaev.library.controllers;

import com.nikolaev.library.entities.Loan;
import com.nikolaev.library.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class LoanController {

    private final LoanService loanService;

    @PostMapping
    public Loan saveLoan(@RequestBody Loan loan) {
        return loanService.saveLoanWithValidation(loan);
    }
}
