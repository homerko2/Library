package com.nikolaev.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "member_address")
public class MemberAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "zip")
    private String zip;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberAddress that)) return false;

        return getId().equals(that.getId()) && Objects.equals(getStreet(), that.getStreet()) && Objects.equals(getHouseNumber(), that.getHouseNumber()) && Objects.equals(getZip(), that.getZip()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + Objects.hashCode(getStreet());
        result = 31 * result + Objects.hashCode(getHouseNumber());
        result = 31 * result + Objects.hashCode(getZip());
        result = 31 * result + Objects.hashCode(getCity());
        result = 31 * result + Objects.hashCode(getCountry());
        return result;
    }

    @Override
    public String toString() {
        return "MemberAddress{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}