package com.nikolaev.library.services;

import com.nikolaev.library.entities.Loan;
import com.nikolaev.library.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@Service
public class LoanService {


    private final LoanRepository loanRepository;


    @Transactional
    public Loan saveLoanWithValidation(Loan loan) {
        if (loan.getBooks().size() > 5) {
            throw new IllegalArgumentException("Cannot save loan with more than 5 books");
        }
        return loanRepository.save(loan);
    }

}
