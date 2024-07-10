package com.nikolaev.library.repositories;

import com.nikolaev.library.entities.MemberAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "member_addresses", path = "member_addresses")
public interface MemberAddressRepository extends PagingAndSortingRepository<MemberAddress, Long>, CrudRepository<MemberAddress, Long> {

}