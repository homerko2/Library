package com.nikolaev.library.repositories;

import com.nikolaev.library.entities.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "loans", path = "loans")
public interface LoanRepository extends PagingAndSortingRepository<Loan, Long>, CrudRepository<Loan, Long> {


}