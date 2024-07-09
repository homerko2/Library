package com.nikolaev.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "loan_date")
    private Date loanDate;

    @Column(name = "return_date")
    private Date returnDate;

    @OneToMany
    @JoinColumn(name = "book_id")
    private List<Book> books;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan loan)) return false;

        return getId().equals(loan.getId()) && Objects.equals(getBooks(), loan.getBooks()) && Objects.equals(getLoanDate(), loan.getLoanDate()) && Objects.equals(getReturnDate(), loan.getReturnDate());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + Objects.hashCode(getBooks());
        result = 31 * result + Objects.hashCode(getLoanDate());
        result = 31 * result + Objects.hashCode(getReturnDate());
        return result;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "returnDate=" + returnDate +
                ", loanDate=" + loanDate +
                ", books=" + books +
                ", id=" + id +
                '}';
    }
}