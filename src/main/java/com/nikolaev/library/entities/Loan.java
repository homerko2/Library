package com.nikolaev.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The Loan class represents a loan made by a member for one or more books.
 */
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
    private LocalDate loanDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @OneToMany(mappedBy = "loan")
    private List<Book> books;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan loan)) return false;
        return Objects.equals(id, loan.id) && Objects.equals(loanDate, loan.loanDate) && Objects.equals(returnDate, loan.returnDate) && Objects.equals(books, loan.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loanDate, returnDate, books);
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