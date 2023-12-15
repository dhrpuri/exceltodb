package com.example.exceltodb.repositories;

import com.example.exceltodb.entity.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Integer> {
}
