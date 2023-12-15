package com.example.exceltodb.repositories;

import com.example.exceltodb.entity.Document;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends PagingAndSortingRepository<Document, Integer> {
}
