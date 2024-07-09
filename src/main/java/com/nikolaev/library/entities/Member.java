package com.nikolaev.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "member", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"})
})
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_Number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private MemberAddress address;

    @OneToMany
    @JoinColumn(name = "loan_id")
    private List<Loan> loan;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;

        return getId().equals(member.getId()) && Objects.equals(getUsername(), member.getUsername()) && Objects.equals(getEmail(), member.getEmail()) && Objects.equals(getPhoneNumber(), member.getPhoneNumber()) && Objects.equals(getAddress(), member.getAddress()) && Objects.equals(getLoan(), member.getLoan());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + Objects.hashCode(getUsername());
        result = 31 * result + Objects.hashCode(getEmail());
        result = 31 * result + Objects.hashCode(getPhoneNumber());
        result = 31 * result + Objects.hashCode(getAddress());
        result = 31 * result + Objects.hashCode(getLoan());
        return result;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", loan=" + loan +
                '}';
    }
}